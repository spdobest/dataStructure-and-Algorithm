package sptech.datastructureandalgorithm.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by root on 7/25/18.
 */

public class TreesetMain {
    public static void main(String...argsa){

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Siba");
        treeSet.add("amit");
        treeSet.add("prasad");

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            String str = iterator.next().toString();
            System.out.println(""+str);
        }

    }
}
