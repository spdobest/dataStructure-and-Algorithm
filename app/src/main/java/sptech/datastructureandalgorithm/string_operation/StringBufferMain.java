package sptech.datastructureandalgorithm.string_operation;

/**
 * Created by root on 7/25/18.
 */

public class StringBufferMain {
    public static void main(String...args){


        StringBuffer a = new StringBuffer("siba");
        StringBuffer b =  new StringBuffer("siba");

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
