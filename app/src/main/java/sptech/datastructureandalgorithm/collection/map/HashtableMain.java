package sptech.datastructureandalgorithm.collection.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by root on 7/25/18.
 */

public class HashtableMain {
    public static void main(String...args){
        //creating a hash table
        Hashtable h = new Hashtable();
        Hashtable h1 = new Hashtable();

        Hashtable<String,String> hashtable = new Hashtable();

        hashtable.put("a","a");
        hashtable.put("b","a");
        hashtable.put("a","a");
        System.out.println("values in hashtable: " + hashtable);


        h.put(3, "Geeks");
        h.put(2, "forGeeks");
        h.put(1, "isBest");

        // create a clone or shallow copy of hash table h
        h1 = (Hashtable)h.clone();

        // checking clone h1
        System.out.println("values in clone: " + h1);

        // clear hash table h
        h.clear();

        // checking hash table h
        System.out.println("after clearing: " + h);

        /**
         * HOW TO ITERATE HASHTABLE
         */

        String str;

        // Creating a Hashtable instance
        Hashtable<String, String> hashtableItr = new Hashtable<String, String>();

    /* Adding key-value pairs to Hashtable
     * public V put(K key, V value): Maps the specified key to the
     * specified value in this hashtable. Neither the key nor the
     * value can be null. The value can be retrieved by calling the
     * get method with a key that is equal to the original key.
     */
        hashtableItr.put("A", "Apple");
        hashtableItr.put("B", "Orange");
        hashtableItr.put("C", "Mango");
        hashtableItr.put("D", "Banana");
        hashtableItr.put("E", "Grapes");

        System.out.println("hashtableItr contains:");

    /* public Set<K> keySet(): Returns a Set view of the keys
     * contained in this map. The set is backed by the map,
     * so changes to the map are reflected in the set, and
     * vice-versa.
     */
        Set<String> keys = hashtableItr.keySet();

        //Obtaining iterator over set entries
        Iterator<String> itr = keys.iterator();

        //Displaying Key and value pairs
        while (itr.hasNext()) {
            // Getting Key
            str = itr.next();
       /* public V get(Object key): Returns the value to which
        * the specified key is mapped, or null if this map
        * contains no mapping for the key.
        */
            System.out.println("Key: "+str+" & Value: "+hashtableItr.get(str));
        }

    }
}
