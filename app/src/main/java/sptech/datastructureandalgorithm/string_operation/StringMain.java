package sptech.datastructureandalgorithm.string_operation;

/**
 * Created by root on 7/25/18.
 */

public class StringMain {
    public static void main(String...args){


        String a = "siba";
        String b = "siba";
        String c = new String("siba");
        String d = new String("siba");

        if(a==b){
            System.out.println("a and b are equal ");
        }
        else{
            System.out.println("a and b are NOT equal ");
        }

        if(a==c){
            System.out.println("a and c are equal ");
        }
        else{
            System.out.println("a and c are NOT equal ");
        }

        if(c==d){
            System.out.println("C and D are equal ");
        }
        else{
            System.out.println("C and D are NOT equal ");
        }

        if(a.equals(b)){
            System.out.println("a and b content are equal");
        }

    }
}
