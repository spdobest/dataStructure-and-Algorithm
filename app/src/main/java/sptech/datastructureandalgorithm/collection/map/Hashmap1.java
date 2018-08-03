package sptech.datastructureandalgorithm.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by root on 7/25/18.
 */

public class Hashmap1 {
    public static void main(String...args){
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"froyo");
        map.put(2,"abby");
        map.put(3,"denver");
        map.put(4,"frost");
        map.put(5,"daisy");





    }

    private void shortByKeysUsingTreemap(){
        // let's create a map with Java releases and their code names
        HashMap<String, String> codenames = new HashMap<String, String>();

        codenames.put("JDK 1.1.4", "Sparkler");
        codenames.put("J2SE 1.2", "Playground");
        codenames.put("J2SE 1.3", "Kestrel");
        codenames.put("J2SE 1.4", "Merlin");
        codenames.put("J2SE 5.0", "Tiger");
        codenames.put("Java SE 6", "Mustang");
        codenames.put("Java SE 7", "Dolphin");

        System.out.println("HashMap before sorting, random order ");
        Set<Map.Entry<String, String>> entries = codenames.entrySet();

        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }

        // Now let's sort HashMap by keys first
        // all you need to do is create a TreeMap with mappings of HashMap
        // TreeMap keeps all entries in sorted order
        TreeMap<String, String> sorted = new TreeMap<>(codenames);
        Set<Map.Entry<String, String>> mappings = sorted.entrySet();

        System.out.println("HashMap after sorting by keys in ascending order ");
        for(Map.Entry<String, String> mapping : mappings){
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }
    }

    private void sortHashmapByValue(){

        HashMap<String, String> codenames = new HashMap<String, String>();

        codenames.put("JDK 1.1.4", "Sparkler");
        codenames.put("J2SE 1.2", "Playground");
        codenames.put("J2SE 1.3", "Kestrel");
        codenames.put("J2SE 1.4", "Merlin");
        codenames.put("J2SE 5.0", "Tiger");
        codenames.put("Java SE 6", "Mustang");
        codenames.put("Java SE 7", "Dolphin");

        System.out.println("HashMap before sorting, random order ");
        Set<Map.Entry<String, String>> entries = codenames.entrySet();
        // Now let's sort the HashMap by values
        // there is no direct way to sort HashMap by values but you
        // can do this by writing your own comparator, which takes
        // Map.Entry object and arrange them in order increasing
        // or decreasing by values.

        Comparator<Map.Entry<String, String>> valueComparator = new Comparator<Map.Entry<String,String>>() {

            @Override
            public int compare(Map.Entry<String, String> e1, Map.Entry<String, String> e2) {
                String v1 = e1.getValue();
                String v2 = e2.getValue();
                return v1.compareTo(v2);
            }
        };

        // Sort method needs a List, so let's first convert Set to List in Java
        List<Map.Entry<String, String>> listOfEntries = new ArrayList<Map.Entry<String, String>>(entries);

        // sorting HashMap by values using comparator
        Collections.sort(listOfEntries, valueComparator);

        LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listOfEntries.size());

        // copying entries from List to Map
        for(Map.Entry<String, String> entry : listOfEntries){
            sortedByValue.put(entry.getKey(), entry.getValue());
        }

        System.out.println("HashMap after sorting entries by values ");
        Set<Map.Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();

        for(Map.Entry<String, String> mapping : entrySetSortedByValue){
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }
    }

}
