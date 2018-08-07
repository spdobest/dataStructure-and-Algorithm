package sptech.datastructureandalgorithm.collection.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableMain1 {
    public static void main(String...args) {
        Hashtable<String, String> hashTable = new Hashtable<>();
        hashTable.put("1", "a");
        hashTable.put("2", "b");
        hashTable.put("3", "c");
        hashTable.put("4", "d");
        hashTable.put("5", "e");
        hashTable.put("6", "f");
        hashTable.put("7", "g");

        Enumeration e = hashTable.elements();
        while (e.hasMoreElements()){
            System.out.println(""+e.nextElement());
        }

    }
}
