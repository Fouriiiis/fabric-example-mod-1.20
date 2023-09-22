package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;




public class ModSounds {

    // Define the Region outside of the registerSounds() method so it can be accessed globally.
    

    //current region
    public static Region currentRegion;

    //map of regions indexed by name
    public static Map<String, Region> regions = new HashMap<String, Region>();

    //map of regions indexed by list of biomes
    public static Map<List<String>, Region> biomeRegions = new HashMap<List<String>, Region>();


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier("modid", name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        SoundEvent th_cc_arps = registerSoundEvent("th_cc_arps");
        SoundEvent th_cc_bass = registerSoundEvent("th_cc_bass");
        SoundEvent th_cc_gutterbass = registerSoundEvent("th_cc_gutterbass");
        SoundEvent th_cc_guttervox = registerSoundEvent("th_cc_guttervox");
        SoundEvent th_cc_kick = registerSoundEvent("th_cc_kick");
        SoundEvent th_cc_noise = registerSoundEvent("th_cc_noise");
        SoundEvent th_cc_perc1 = registerSoundEvent("th_cc_perc1");
        SoundEvent th_cc_perc2 = registerSoundEvent("th_cc_perc2");
        SoundEvent th_cc_snare = registerSoundEvent("th_cc_snare");
        SoundEvent th_cc_vox = registerSoundEvent("th_cc_vox");
        SoundEvent th_dm_bass = registerSoundEvent("th_dm_bass");
        SoundEvent th_dm_kick = registerSoundEvent("th_dm_kick");
        SoundEvent th_dm_lead = registerSoundEvent("th_dm_lead");
        SoundEvent th_dm_noise = registerSoundEvent("th_dm_noise");
        SoundEvent th_dm_shaker = registerSoundEvent("th_dm_shaker");
        SoundEvent th_dm_snare = registerSoundEvent("th_dm_snare");
        SoundEvent th_gw_bass = registerSoundEvent("th_gw_bass");
        SoundEvent th_gw_kick = registerSoundEvent("th_gw_kick");
        SoundEvent th_gw_lead = registerSoundEvent("th_gw_lead");
        SoundEvent th_gw_noise = registerSoundEvent("th_gw_noise");
        SoundEvent th_gw_perc1 = registerSoundEvent("th_gw_perc1");
        SoundEvent th_gw_perc2 = registerSoundEvent("th_gw_perc2");
        SoundEvent th_gw_shake = registerSoundEvent("th_gw_shake");
        SoundEvent th_gw_vox = registerSoundEvent("th_gw_vox");
        SoundEvent th_gw_weird = registerSoundEvent("th_gw_weird");
        SoundEvent th_hi_bass = registerSoundEvent("th_hi_bass");
        SoundEvent th_hi_kick = registerSoundEvent("th_hi_kick");
        SoundEvent th_hi_noise = registerSoundEvent("th_hi_noise");
        SoundEvent th_hi_perc1 = registerSoundEvent("th_hi_perc1");
        SoundEvent th_hi_render = registerSoundEvent("th_hi_render");
        SoundEvent th_hi_shaker = registerSoundEvent("th_hi_shaker");
        SoundEvent th_hi_snare = registerSoundEvent("th_hi_snare");
        SoundEvent th_hi_vox = registerSoundEvent("th_hi_vox");
        SoundEvent th_hi_weird = registerSoundEvent("th_hi_weird");
        SoundEvent th_hr_bass = registerSoundEvent("th_hr_bass");
        SoundEvent th_hr_hat1 = registerSoundEvent("th_hr_hat1");
        SoundEvent th_hr_hat2 = registerSoundEvent("th_hr_hat2");
        SoundEvent th_hr_kick = registerSoundEvent("th_hr_kick");
        SoundEvent th_hr_lead = registerSoundEvent("th_hr_lead");
        SoundEvent th_hr_noise = registerSoundEvent("th_hr_noise");
        SoundEvent th_hr_pad = registerSoundEvent("th_hr_pad");
        SoundEvent th_hr_perc = registerSoundEvent("th_hr_perc");
        SoundEvent th_hr_snare = registerSoundEvent("th_hr_snare");
        SoundEvent th_hr_weird = registerSoundEvent("th_hr_weird");
        SoundEvent th_lc_dayarp = registerSoundEvent("th_lc_dayarp");
        SoundEvent th_lc_dayatmos = registerSoundEvent("th_lc_dayatmos");
        SoundEvent th_lc_daybreaks = registerSoundEvent("th_lc_daybreaks");
        SoundEvent th_lc_daykick = registerSoundEvent("th_lc_daykick");
        SoundEvent th_lc_dayperc = registerSoundEvent("th_lc_dayperc");
        SoundEvent th_lc_dayshaker = registerSoundEvent("th_lc_dayshaker");
        SoundEvent th_lc_daysub = registerSoundEvent("th_lc_daysub");
        SoundEvent th_lc_daysynth = registerSoundEvent("th_lc_daysynth");
        SoundEvent th_lc_daytom = registerSoundEvent("th_lc_daytom");
        SoundEvent th_lc_nightatmos = registerSoundEvent("th_lc_nightatmos");
        SoundEvent th_lc_nighthat = registerSoundEvent("th_lc_nighthat");
        SoundEvent th_lc_nightkick = registerSoundEvent("th_lc_nightkick");
        SoundEvent th_lc_nightnoise = registerSoundEvent("th_lc_nightnoise");
        SoundEvent th_lc_nightperc = registerSoundEvent("th_lc_nightperc");
        SoundEvent th_lc_nightshaker = registerSoundEvent("th_lc_nightshaker");
        SoundEvent th_lc_nightsub = registerSoundEvent("th_lc_nightsub");
        SoundEvent th_lc_nightsynth = registerSoundEvent("th_lc_nightsynth");
        SoundEvent th_lc_nighttom = registerSoundEvent("th_lc_nighttom");
        SoundEvent th_lf_arps = registerSoundEvent("th_lf_arps");
        SoundEvent th_lf_bass = registerSoundEvent("th_lf_bass");
        SoundEvent th_lf_chords = registerSoundEvent("th_lf_chords");
        SoundEvent th_lf_kick = registerSoundEvent("th_lf_kick");
        SoundEvent th_lf_noise = registerSoundEvent("th_lf_noise");
        SoundEvent th_lf_perc1 = registerSoundEvent("th_lf_perc1");
        SoundEvent th_lf_perc2 = registerSoundEvent("th_lf_perc2");
        SoundEvent th_lf_shaker = registerSoundEvent("th_lf_shaker");
        SoundEvent th_lf_snare = registerSoundEvent("th_lf_snare");
        SoundEvent th_lm_arps = registerSoundEvent("th_lm_arps");
        SoundEvent th_lm_bass = registerSoundEvent("th_lm_bass");
        SoundEvent th_lm_kick = registerSoundEvent("th_lm_kick");
        SoundEvent th_lm_noise = registerSoundEvent("th_lm_noise");
        SoundEvent th_lm_pad = registerSoundEvent("th_lm_pad");
        SoundEvent th_lm_perc1 = registerSoundEvent("th_lm_perc1");
        SoundEvent th_lm_perc2 = registerSoundEvent("th_lm_perc2");
        SoundEvent th_lm_snare = registerSoundEvent("th_lm_snare");
        SoundEvent th_lm_weird = registerSoundEvent("th_lm_weird");
        SoundEvent th_oe_arp = registerSoundEvent("th_oe_arp");
        SoundEvent th_oe_bass = registerSoundEvent("th_oe_bass");
        SoundEvent th_oe_flow = registerSoundEvent("th_oe_flow");
        SoundEvent th_oe_kickperc = registerSoundEvent("th_oe_kickperc");
        SoundEvent th_oe_lead = registerSoundEvent("th_oe_lead");
        SoundEvent th_oe_noise = registerSoundEvent("th_oe_noise");
        SoundEvent th_oe_perc2 = registerSoundEvent("th_oe_perc2");
        SoundEvent th_oe_waves = registerSoundEvent("th_oe_waves");
        SoundEvent th_si_arps = registerSoundEvent("th_si_arps");
        SoundEvent th_si_bass = registerSoundEvent("th_si_bass");
        SoundEvent th_si_kick = registerSoundEvent("th_si_kick");
        SoundEvent th_si_noise = registerSoundEvent("th_si_noise");
        SoundEvent th_si_panic = registerSoundEvent("th_si_panic");
        SoundEvent th_si_perc1 = registerSoundEvent("th_si_perc1");
        SoundEvent th_si_shaker = registerSoundEvent("th_si_shaker");
        SoundEvent th_si_snare = registerSoundEvent("th_si_snare");
        SoundEvent th_si_weird = registerSoundEvent("th_si_weird");
        SoundEvent th_sl_arps = registerSoundEvent("th_sl_arps");
        SoundEvent th_sl_bass = registerSoundEvent("th_sl_bass");
        SoundEvent th_sl_kick = registerSoundEvent("th_sl_kick");
        SoundEvent th_sl_lead = registerSoundEvent("th_sl_lead");
        SoundEvent th_sl_noise = registerSoundEvent("th_sl_noise");
        SoundEvent th_sl_perc1 = registerSoundEvent("th_sl_perc1");
        SoundEvent th_sl_perc2 = registerSoundEvent("th_sl_perc2");
        SoundEvent th_sl_snare = registerSoundEvent("th_sl_snare");
        SoundEvent th_ss_bass = registerSoundEvent("th_ss_bass");
        SoundEvent th_ss_kick = registerSoundEvent("th_ss_kick");
        SoundEvent th_ss_lead = registerSoundEvent("th_ss_lead");
        SoundEvent th_ss_noise = registerSoundEvent("th_ss_noise");
        SoundEvent th_ss_pop = registerSoundEvent("th_ss_pop");
        SoundEvent th_su_arps = registerSoundEvent("th_su_arps");
        SoundEvent th_su_bass = registerSoundEvent("th_su_bass");
        SoundEvent th_su_hits = registerSoundEvent("th_su_hits");
        SoundEvent th_su_kick = registerSoundEvent("th_su_kick");
        SoundEvent th_su_lead = registerSoundEvent("th_su_lead");
        SoundEvent th_su_noise = registerSoundEvent("th_su_noise");
        SoundEvent th_su_perc1 = registerSoundEvent("th_su_perc1");
        SoundEvent th_su_shaker = registerSoundEvent("th_su_shaker");
        SoundEvent th_vs_arps = registerSoundEvent("th_vs_arps");
        SoundEvent th_vs_bass = registerSoundEvent("th_vs_bass");
        SoundEvent th_vs_kick = registerSoundEvent("th_vs_kick");
        SoundEvent th_vs_noise = registerSoundEvent("th_vs_noise");
        SoundEvent th_vs_perc1 = registerSoundEvent("th_vs_perc1");
        SoundEvent th_vs_perc2 = registerSoundEvent("th_vs_perc2");
        SoundEvent th_vs_shaker = registerSoundEvent("th_vs_shaker");
        SoundEvent th_vs_synth = registerSoundEvent("th_vs_synth");
        SoundEvent th_vs_weird = registerSoundEvent("th_vs_weird");


        // Create a new region called "su" and add layers to it
        // Layer : TH_SU - KICK, TH_SU - SHAKER
        // Layer : TH_SU - KICK, TH_SU - SHAKER, TH_SU - PERC1, TH_SU - NOISE
        // Layer : TH_SU - KICK, TH_SU - SHAKER, TH_SU - PERC1, TH_SU - NOISE, TH_SU - HITS, TH_SU - BASS
        // Layer : TH_SU - KICK, TH_SU - SHAKER, TH_SU - PERC1, TH_SU - ARPS, TH_SU - NOISE, TH_SU - HITS, TH_SU - BASS
        // Layer : TH_SU - LEAD, TH_SU - BASS
        regions.put("su", new Region(
            new HashMap<Integer, List<SoundEvent>>() {{
                put(0, new ArrayList<SoundEvent>() {{
                    add(th_su_kick);
                    add(th_su_shaker);
                }});
                put(30, new ArrayList<SoundEvent>() {{
                    add(th_su_kick);
                    add(th_su_shaker);
                    add(th_su_perc1);
                    add(th_su_noise);
                }});
                put(60, new ArrayList<SoundEvent>() {{
                    add(th_su_kick);
                    add(th_su_shaker);
                    add(th_su_perc1);
                    add(th_su_noise);
                    add(th_su_hits);
                    add(th_su_bass);
                }});
                put(90, new ArrayList<SoundEvent>() {{
                    add(th_su_kick);
                    add(th_su_shaker);
                    add(th_su_perc1);
                    add(th_su_arps);
                    add(th_su_noise);
                    add(th_su_hits);
                    add(th_su_bass);
                }});
                put(120, new ArrayList<SoundEvent>() {{
                    add(th_su_lead);
                    add(th_su_bass);
                }});
            }}
        ));

        //Layer : TH_SL - KICK, TH_SL - BASS
        //Layer : TH_SL - KICK, TH_SL - BASS, TH_SL - PERC2, TH_SL - ARPS
        //Layer : TH_SL - KICK, TH_SL - BASS, TH_SL - PERC2, TH_SL - ARPS, TH_SL - NOISE, TH_SL - SNARE
        //Layer : TH_SL - KICK, TH_SL - BASS, TH_SL - PERC2, TH_SL - ARPS, TH_SL - NOISE, TH_SL - SNARE, TH_SL - PERC2, TH_SL - LEAD
        //Layer : TH_SL - KICK, TH_SL - BASS, TH_SL - PERC2, TH_SL - ARPS, TH_SL - NOISE, TH_SL - SNARE, TH_SL - PERC2, TH_SL - LEAD
        regions.put("sl", new Region(
            new HashMap<Integer, List<SoundEvent>>() {{
                put(0, new ArrayList<SoundEvent>() {{
                    add(th_sl_kick);
                    add(th_sl_bass);
                }});
                put(30, new ArrayList<SoundEvent>() {{
                    add(th_sl_kick);
                    add(th_sl_bass);
                    add(th_sl_perc2);
                    add(th_sl_arps);
                }});
                put(60, new ArrayList<SoundEvent>() {{
                    add(th_sl_kick);
                    add(th_sl_bass);
                    add(th_sl_perc2);
                    add(th_sl_arps);
                    add(th_sl_noise);
                    add(th_sl_snare);
                }});
                put(80, new ArrayList<SoundEvent>() {{
                    add(th_sl_kick);
                    add(th_sl_bass);
                    add(th_sl_perc2);
                    add(th_sl_arps);
                    add(th_sl_noise);
                    add(th_sl_snare);
                    add(th_sl_perc2);
                    add(th_sl_lead);
                }});
                put(120, new ArrayList<SoundEvent>() {{
                    add(th_sl_kick);
                    add(th_sl_bass);
                    add(th_sl_perc2);
                    add(th_sl_arps);
                    add(th_sl_noise);
                    add(th_sl_snare);
                    add(th_sl_perc2);
                    add(th_sl_lead);
                }});
            }}
        ));

        //Layer : TH_SS - NOISE, TH_SS - BASS, TH_SS - KICK
        //Layer : TH_SS - NOISE, TH_SS - BASS, TH_SS - KICK, TH_SS - POP
        //Layer : TH_SS - NOISE, TH_SS - BASS, TH_SS - KICK, TH_SS - POP, TH_SS - LEAD
        //Layer : TH_SS - NOISE, TH_SS - BASS, TH_SS - KICK, TH_SS - POP, TH_SS - LEAD

        regions.put("ss", new Region(
            new HashMap<Integer, List<SoundEvent>>() {{
                put(0, new ArrayList<SoundEvent>() {{
                    add(th_ss_noise);
                    add(th_ss_bass);
                    add(th_ss_kick);
                }});
                put(30, new ArrayList<SoundEvent>() {{
                    add(th_ss_noise);
                    add(th_ss_bass);
                    add(th_ss_kick);
                    add(th_ss_pop);
                }});
                put(60, new ArrayList<SoundEvent>() {{
                    add(th_ss_noise);
                    add(th_ss_bass);
                    add(th_ss_kick);
                    add(th_ss_pop);
                    add(th_ss_lead);
                }});
                put(90, new ArrayList<SoundEvent>() {{
                    add(th_ss_noise);
                    add(th_ss_bass);
                    add(th_ss_kick);
                    add(th_ss_pop);
                    add(th_ss_lead);
                }});
            }}
        ));

        
        

        //add regions to biomeRegions
        //ss is for all ocean biomes
        biomeRegions.put(new ArrayList<String>() {{
            add("Ocean");
            add("Deep Ocean");
            add("Frozen Ocean");
            add("Deep Frozen Ocean");
            add("Cold Ocean");
            add("Deep Cold Ocean");
            add("Lukewarm Ocean");
            add("Deep Lukewarm Ocean");
            add("Warm Ocean");
            add("Deep Warm Ocean");
            add("River");
            add("Frozen River");
            add("Beach");
            add("Stone Shore");
            add("Snowy Beach");
            add("Mushroom Fields Shore");
            add("Desert Lakes");

        }}, regions.get("sl"));

        //ss is for all end biomes
        biomeRegions.put(new ArrayList<String>() {{
            add("The End");
            add("Small End Islands");
            add("End Midlands");
            add("End Highlands");
            add("End Barrens");
        }}, regions.get("ss"));

        //set default region to su
        currentRegion = regions.get("su");
    }

    public static void changeRegion(MinecraftClient client) {
        //get the current biome e.g. minecraft:plains using the value in the f3 menu
        RegistryEntry<Biome> var27 = client.world.getBiome(client.player.getBlockPos());
        String biome = I18n.translate(getBiomeName(var27));

        //print the current biome to the chat
        client.player.sendMessage(Text.of(biome), false);

        //change the region to the region whose list of biomes contains the current biome
        Region newRegion = null;
        for (Map.Entry<List<String>, Region> entry : biomeRegions.entrySet()) {
            if (entry.getKey().contains(biome)) {
                newRegion = entry.getValue();
                break;
            }
            //otherwise, set the region to the default region
            newRegion = regions.get("su");
        }

        //if the new region is different from the current region, stop the current region
        if (currentRegion != null && !newRegion.equals(currentRegion)) {
            
            currentRegion = newRegion;
            client.player.sendMessage(Text.of("changing music"), false);
        }
    }

    public static String getBiomeName(RegistryEntry<Biome> biome) {
        return I18n.translate(getBiomeTranslationKey(biome));
    }

    private static String getBiomeTranslationKey(RegistryEntry<Biome> biome) {
        return biome.getKeyOrValue().map(
            (biomeKey) -> "biome." + biomeKey.getValue().getNamespace() + "." + biomeKey.getValue().getPath(),
            (biomeValue) -> "[unregistered " + biomeValue + "]" // For unregistered biome
        );
    }
}
