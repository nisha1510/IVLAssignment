package dsa;

import java.util.Arrays;
import java.util.Iterator;

public class BubbleSortDemo {

	public static void bubblesort(int[] arr) {
		boolean swapped;
		//run the steps n-1 times
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			//for each step, max item will be come at last respective index
			for (int j = 1; j < arr.length - i; j++) {
				//swap if the item is smaller than previous one
				if(arr[j] < arr[j-1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			//if you did not swap for particular value of i, it means the array is sorted hence stop the program
			if(!swapped) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {0,-1,-2,3,4,5};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
