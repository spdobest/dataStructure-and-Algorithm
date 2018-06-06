# dataStructure-and-Algorithm
It a sample Project which contains Searching , Sorting, Time Complexity, all data structure and their complexity

# Searching  
There two types of search in java.

## Linear Search  
This type of search is simple and time consuming. To search one item from an array we have to compare each item in the array until we match the item in the array.
For example the linear Search logic will be like Below  
  
    private void linearSearch(int searchedItem, int[] array){  
        for(int i = 0;i<array.length;i++){  
            if(array[i] == searchedItem){ 
                System.out.print("searched Position - "+i);  
            }  
        }  
    }  
      
 ### Diagram for Linear Search
 ![alt tag](https://github.com/spdobest/dataStructure-and-Algorithm/blob/master/images/linearSearch.gif)
      
## Binary Search
Binary search will be work only if the array is sorted. in this case the array will be devided by 2 parts.  
1. It will check if the middle item of the array is less than, equal or greater than the searched item
case 1  - if the searchd item == the middle item then, return the position
case 2 - if the Searched item < the middle Item then, it will follow the same process
case 3 - if the searched item > the middle item then, fullow the same method by passing first position as the middle position and last position as the list size -1.

 ### Diagram for Binary Search
 ![alt tag](https://github.com/spdobest/dataStructure-and-Algorithm/blob/master/images/binarysearch.png)


# Different Sorting Algorithms  
There are many different techniques available for sorting, differentiated by their efficiency and space requirements. Following are some sorting techniques which we will be covering in next few tutorials.  
  
**1. Bubble Sort  
2. Insertion Sort  
3. Selection Sort  
4. Quick Sort  
5. Merge Sort  
6. Heap Sort**  
  
## Bubble Sort   
It have the worst case and average time complexity of O(n2), where n is the number of Items in the array to be sort.  
First one item will be compare with the other items present in the array. if it is smaller number or larger number, it will be swap accordingly. Similary this loop will continue  
  
**Time Complexity of Bubble Sort** 
Best Case    : n
Average Case : n square
Worst Case   : n square
    
**Here is the Diagram and Example **  
  
// logic to sort the elements  
    public static Int[] bubble_srt(int array[]) {  
        int n = array.length;  
        int k;  
        for (int m = n; m >= 0; m--) {  
            for (int i = 0; i < n - 1; i++) {  
                k = i + 1;  
                if (array[i] > array[k]) {  
                    swapNumbers(i, k, array);  
                }  
            }  
            return array;  
        }  
        return array;  
    }  
  
    private static void swapNumbers(int i, int j, int[] array) {  
  
        int temp;  
        temp = array[i];  
        array[i] = array[j];  
        array[j] = temp;  
    }  
      
## Selection Sort  

  public static int[] doSelectionSort(int[] arr){  
           
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)  
                if (arr[j] < arr[index])   
                    index = j;  
        
            int smallerNumber = arr[index];    
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
        return arr;  
    }  
    
   
**Time Complexity of Selection Sort** 
Best Case    : n square
Average Case : n square
Worst Case   : n square
       
**Diagram of Selection Sort  
  

    
## Insertion Sort  
  
Insertion sort is a simple sorting algorithm, it builds the final sorted array one item at a time. It is much less efficient on large lists than other sort algorithms.  
  
**Advantages of Insertion Sort:**     
  
1) It is very simple.  
2) It is very efficient for small data sets.  
3) It is stable; i.e., it does not change the relative order of elements with equal keys.  
4) In-place; i.e., only requires a constant amount O(1) of additional memory space.  
  
Insertion sort iterates through the list by consuming one input element at each repetition, and growing a sorted output list. On a repetition, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain.   
  
**Program**  
   
    public static int[] doInsertionSort(int[] input){  
           
        int temp;  
        for (int i = 1; i < input.length; i++) {  
            for(int j = i ; j > 0 ; j--){  
                if(input[j] < input[j-1]){  
                    temp = input[j];  
                    input[j] = input[j-1];  
                    input[j-1] = temp;  
                }  
            }  
        }  
        return input;  
    }  
    
    
**Time Complexity of Insertion Sort** 
Best Case    : n
Average Case : n Square
Worst Case   : n Square
    
## Quick Sort  
  
  
    
**Time Complexity** 
Best Case    : n log n
Average Case : n log n
Worst Case   : n Square
    
## Merge Sort  
    
     
       
**Time Complexity** 
Best Case    : n log n
Average Case : n log n
Worst Case   : n log n
    
## Heap Sort  
  
    
**Time Complexity** 
Best Case    : n , if all keys are distinct else n log n
Average Case : n log n
Worst Case   : n log n  

**Q. Which the best sorting Algorithm ?**
Mergesort is up there with the fastest standard sort algorithms. The default Collections.sort() implementation in Java 7 is a Mergesort algorithm adapted from 'TimSort.' The default Arrays.sort() implementation in Java 7 is a dual pivot Quicksort.  
  
  
    
 
