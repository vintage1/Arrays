package arraySortAndSearch;

import java.util.Arrays;

public class ArraySortAndSearch {

	public static void main(String[] args) {
		int array[] = { 2, 4, 5, 6, -1, -2, -3, 6,2, 7, 3 };
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		printArray("Sorted array is", array);
		System.out.println(Arrays.toString(array));
		int index = Arrays.binarySearch(array, 2);
		System.out.println("found 2 @" + index);
	}

	private static void printArray(String message, int array[]) {
       System.out.println(message + ":[length:" +array.length + "]");
       for(int i=0; i<array.length;i++){
    	   if(i!=0){
    		   System.out.print(", ");
    	   }
    	   System.out.print(array[i]);
       }
       System.out.println();
       }
	}


