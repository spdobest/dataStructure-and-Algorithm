package sptech.datastructureandalgorithm.Interview_programs;

/**
 * Created by root on 8/6/18.
 */

public class NumberisPowerOf {

    public static void main(String...args){
        NumberisPowerOf numberisPowerOf = new NumberisPowerOf();
        numberisPowerOf.printPowerOf(3,27);
    }

    public void printPowerOf(int a,int bigNumber){

        int big = bigNumber;

        int count = 0;

        while(bigNumber>1){

            if(bigNumber%a == 0){
                bigNumber = bigNumber/a;
                count++;
            }
            else{
                count = 0;
                return;
            }
        }

        if(count>0){
            System.out.println(a+" To The Power "+count+" is = "+big);
        }

    }

}
