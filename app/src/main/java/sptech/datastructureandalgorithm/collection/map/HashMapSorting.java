package sptech.datastructureandalgorithm.collection.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSorting {
    public static void main(String...args){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","siba");
        hashMap.put("3","Satya");
        hashMap.put("5","amit");
        hashMap.put("2","narayan");
        hashMap.put("3","prasad");
        hashMap.put("0","mohanty");


        Set<Map.Entry<String,String>> entries = hashMap.entrySet();
        System.out.println("Before Sorting");
        for(Map.Entry<String,String> entry : entries){
            System.out.println("Key "+entry.getKey()+" "+entry.getValue());
        }
        System.out.println(" Sorting By key");

        TreeMap<String,String> treemap = new TreeMap<>(hashMap);
        Set<Map.Entry<String,String>> entriesSorted = treemap.entrySet();

        for(Map.Entry<String,String> entry : entriesSorted){
            System.out.println("Key "+entry.getKey()+" "+entry.getValue());
        }

        Comparator<Map.Entry<String, String>> valueComparator = new Comparator<Map.Entry<String,String>>() {
            @Override public int compare(Map.Entry<String, String> e1, Map.Entry<String, String> e2) {
                String v1 = e1.getValue(); String v2 = e2.getValue(); return v1.compareTo(v2);
            }
        };

        List<Map.Entry<String,String>> listEntries = new ArrayList<>(entries);
        Collections.sort(listEntries,valueComparator);

        LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listEntries.size());
        // copying entries from List to Map
        for(Map.Entry<String, String> entry : listEntries){
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        System.out.println("HashMap after sorting entries by values ");
        Set<Map.Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();
        for(Map.Entry<String, String> mapping : entrySetSortedByValue)
        {
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }


    }
}
