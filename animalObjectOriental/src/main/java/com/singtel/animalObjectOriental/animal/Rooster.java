package com.singtel.animalObjectOriental.animal;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {
    private final static Map<String,String> lanMap=new HashMap<String,String>();
    static {
        lanMap.put("Chinese","gegege");
        lanMap.put("Danish","kykyliky");
        lanMap.put("Dutch","kukeleku");
        lanMap.put("Finnish","kukko kiekuu");
        lanMap.put("French","cocorico");
        lanMap.put("German","kikeriki");
        lanMap.put("Greek","kikiriki");
        lanMap.put("Hebrew","coo-koo-ri-koo");
        lanMap.put("Hungarian","kukuriku");
        lanMap.put("Italian","chicchirichi");
        lanMap.put("Japanese","ko-ke-kok-ko-o");
        lanMap.put("Portuguese","cucurucu");
        lanMap.put("Russian","kukareku");
        lanMap.put("Swedish","kuckeliku");
        lanMap.put("Turkish","kuk-kurri-kuuu");
        lanMap.put("Urdu","kuklooku");
    }

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }

    public void sing(String language) {
        System.out.println("I'm Rooster and I'm singing "+(String)lanMap.get(language));
    }
}
