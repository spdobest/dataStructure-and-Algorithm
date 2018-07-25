package sptech.datastructureandalgorithm.collection.list;

import java.util.Vector;

/**
 * Created by root on 7/25/18.
 */

public class VectorMain {
    public static void main(String... args) {

        Vector<String> vector = new Vector<>();
        vector.add("Siba");
        vector.addElement("Prasad");
        vector.addElement("Mohanty");
        vector.addElement("Satya");
        vector.add("Narayan");
        vector.add("Mohanty");

        System.out.println(vector.toString());

        vector.removeElementAt(0);

        System.out.println(vector.toString());

        vector.removeAllElements();


    }
}
