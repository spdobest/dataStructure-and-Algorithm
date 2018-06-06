package sptech.datastructureandalgorithm.searching;

/**
 * Created by root on 6/5/18.
 */

public class BinarySearch {

    public static void main(String...args){
        int[] array = {1,12,15,22,24,29,36,70};
        BinarySearch binarySearch = new BinarySearch();
       System.out.print("Searched Posiition "+binarySearch.search(array,22,0,array.length-1));
    }


    public  int search(int[] array,final int searchedItem,int low,int high) {
        if (array.length == 0) {
            return -1;
        }

        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the
            // middle itself
            if (array[mid] == searchedItem)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (array[mid] > searchedItem)
                return search(array, searchedItem,low, mid-1);

            // Else the element can only be present
            // in right subarray
            return search(array, searchedItem,mid+1,high);
        }
        return -1;
    }

    public int binarySearch(int[] inputArr, int key) {

        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
