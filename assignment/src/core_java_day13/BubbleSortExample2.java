package core_java_day13;

public class BubbleSortExample2 {
    
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
 
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
 
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }   
            // If no swaps, the array is already sorted
            if (!swapped) break;
        }
	}
	public static void main(String[] args) {
		int[] data = {5,2,4,1,3};
		bubbleSort(data);
		
		System.out.println("Sorted Array : ");
		for(int num : data) {
			System.out.print(num+" ");
		}
	}
}
