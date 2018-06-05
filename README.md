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

 ### Diagram for Binary Search
 ![alt tag](https://github.com/spdobest/dataStructure-and-Algorithm/blob/master/images/binarysearch.png)
