package sptech.datastructureandalgorithm.Interview_programs;

import java.util.HashMap;

/**
 * Created by root on 8/6/18.
 */

public class MaximumCharInString {
    public static void main(String...args){
        MaximumCharInString maximumCharInString = new MaximumCharInString();
        maximumCharInString.printMaximumCharInASentence("Programming");

    }

    public void printMaximumCharInASentence(String s){

        int count = 0;
        int maxCOunt = 1;
        char maxChar = '-';
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch:s.toCharArray()){

            if(hashmap.containsKey(ch)){
                int i = hashmap.get(ch);
                hashmap.put(ch,i+1);

                maxChar = ch;
                maxCOunt = 1+i;

            }
            else{
                hashmap.put(ch,1);
                if(maxCOunt < 1){
                    maxChar = ch;
                    maxCOunt = 1;
                }
            }

        }

        System.out.println("THe maximum Time Occured Char is "+maxChar+" and the count is "+maxCOunt);

    }
}
