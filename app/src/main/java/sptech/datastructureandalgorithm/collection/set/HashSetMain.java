package sptech.datastructureandalgorithm.collection.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by root on 7/25/18.
 */

public class HashSetMain {
    public static void main(String...args){

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Siba");
        hashSet.add("Siba");
        hashSet.add("Siba");

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String str = iterator.next().toString();
            System.out.println(str);
        }

        HashSetMain hashSetMain = new HashSetMain();
        hashSetMain.setUp();

    }

    private void setUp(){
        HashSet<MyModel> hashSet = new HashSet<>();
        hashSet.add(new MyModel("Siba",23));
        hashSet.add(new MyModel("Siba",23));
        hashSet.add(new MyModel("Siba",23));

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            MyModel str = (MyModel)iterator.next();
            System.out.println(str.name);
        }
    }

    class MyModel{
        public MyModel(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String name;
        int age;

    }

}
