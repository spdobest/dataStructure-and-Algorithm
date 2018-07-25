package sptech.datastructureandalgorithm.string_operation;

/**
 * Created by root on 7/25/18.
 */

public class StringBuilderMain {
    public static void main(String...args){


        StringBuilder a = new StringBuilder("siba");
        StringBuilder b =  new StringBuilder("siba");

        if(a==b){
            System.out.println("a and b are equal ");
        }
        else{
            System.out.println("a and b are NOT equal ");
        }
        if(a.equals(b)){
            System.out.println("a and b content are equal");
        }
        else{
            System.out.println("a and b content are NOT equal");
        }

    }
}
