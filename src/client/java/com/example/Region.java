package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import net.minecraft.sound.SoundEvent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.MusicTracker;
import net.minecraft.client.sound.SoundManager;

public class Region {

    private Map<Integer, SoundEvent> currLayers;
    private List<SoundPlayer> soundPlayers = new ArrayList<SoundPlayer>();
    private Map<Integer, List<SoundEvent>> layers;
    MinecraftClient client = MinecraftClient.getInstance();


    //constructor which takes a list of lists of sound events
    //each list of sound events is a layer

    public Region(List<List<SoundEvent>> layers) {

        int offset = 100 / (layers.size() - 1);
        int threatLevel = 0;

        //for each list of sound events add it to the layers map with the threat level as the key and increment the threat level
        this.layers = new HashMap<Integer, List<SoundEvent>>();
        for(List<SoundEvent> layer : layers) {
            this.layers.put(threatLevel, layer);
            threatLevel += offset;
        }
        currLayers = new HashMap<Integer, SoundEvent>();
        setupSoundPlayers();
    }

    public void randomizeLayers() {
        //for each list of layers, shuffle the list
        for(List<SoundEvent> layer : layers.values()) {
            Collections.shuffle(layer);
        }
        System.out.println("Randomized layers");
        setupSoundPlayers();
        
    }

    public void setupSoundPlayers() {
        currLayers.clear();
        soundPlayers.clear();
    
        // Create a list of map entries to sort them by threat level
        List<Map.Entry<Integer, List<SoundEvent>>> sortedEntries = new ArrayList<>(layers.entrySet());
        sortedEntries.sort(Map.Entry.comparingByKey());
    
        // Iterate through the sorted entries
        for (Map.Entry<Integer, List<SoundEvent>> entry : sortedEntries) {
            // for all sound events in the layer list
            for (SoundEvent soundEvent : entry.getValue()) {
                // if the sound event is not already in the currLayers map
                if (!currLayers.containsValue(soundEvent)) {
                    // get the sound event from the layer list and add it to the currLayers map
                    currLayers.put(entry.getKey(), soundEvent);
                    // create a new sound player with the sound event and add it to the soundPlayers list
                    soundPlayers.add(new SoundPlayer(soundEvent, client, entry.getKey()));
                    System.out.println("Added sound player with name " + soundEvent.getId().toString() + " and threat level " + entry.getKey());
                    break;
                }
            }
        }
    }
    

    public void play(MinecraftClient client){
        SoundManager soundManager = client.getSoundManager();
        MusicTracker musicTracker = client.getMusicTracker();
        ExecutorService executor = Executors.newCachedThreadPool();
    
        musicTracker.stop();
    
        for (SoundPlayer soundPlayer : soundPlayers) {
            executor.execute(() -> soundManager.play(soundPlayer));
        }
    
        executor.shutdown();
    }

    public void stop(MinecraftClient client){
        if (soundPlayers != null) {
            ExecutorService executor = Executors.newCachedThreadPool();
    
            for (SoundPlayer soundPlayer : soundPlayers) {
                executor.execute(() -> client.getSoundManager().stop(soundPlayer));
            }
    
            executor.shutdown(); // Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted.
        }
    }
}
