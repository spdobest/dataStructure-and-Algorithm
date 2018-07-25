package sptech.datastructureandalgorithm.collection.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by root on 7/25/18.
 */

public class ListMain {
    public static void main(String... args) {

      //  Q : How to make Arraylist as Synchronized ?
        ArrayList<String> aarraylistSynchronize = new ArrayList();
        List l = Collections.synchronizedList(aarraylistSynchronize);


        ArrayList al = new ArrayList(5); // here 5 is the capacity

        String[] array = {"spm"};

        List<String> listString = new ArrayList<>();
        listString.toArray();

       // listString = Arrays.asList(array);

        listString.add("spm");
        listString.add("narayan");
        listString.add("satya");
        listString.add("aman");
        listString.add("bhushan");
        listString.add("chetan");

        List<String> listString1 = new ArrayList<>();
        listString1.add("Rohit");
        listString1.add("Shyam");

        List<String> listString2= new ArrayList<>();
        listString2.add("narayan");
        listString2.add("bhushan");


        System.out.println("Contains "+listString.contains(listString2));

        System.out.println("Contains "+listString2.contains(  "bhushan"));

        listString.retainAll(listString2);


        Collections.sort(listString);
        System.out.println(listString.toString());


        Iterator itr = listString2.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
