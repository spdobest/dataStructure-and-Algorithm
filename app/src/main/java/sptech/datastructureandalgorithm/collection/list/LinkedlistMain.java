package sptech.datastructureandalgorithm.collection.list;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by root on 7/25/18.
 */

public class LinkedlistMain {
    public static void main(String...args){

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Siba");
        System.out.println(linkedList.toString());

        linkedList.addFirst("Prasad");
        linkedList.addLast("Prasad");
        linkedList.addFirst("Prasad");
        linkedList.addLast("Prasad");
        System.out.println(linkedList.toString());
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList.toString());

    }
}
