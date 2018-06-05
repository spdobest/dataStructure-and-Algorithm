package sptech.datastructureandalgorithm.searching;

/**
 * Created by root on 6/5/18.
 */

public class LinearSearch {
    public static int searchItem(int[] array,int searchedItem){
        int position = -1;
        for(int i = 0;i<array.length;i++){
            if(array[i] == searchedItem)
                position = i;
        }
        return position;
    }

}
