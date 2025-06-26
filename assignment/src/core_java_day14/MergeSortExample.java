package core_java_day14;

public class MergeSortExample {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 9, 5, 2, 8 };
		System.out.println("Original Array!");
		printArray(arr);
		mergeSort(arr, 0, arr.length - 1);
		System.out.println();
		System.out.println("Sorted Array");
		printArray(arr);
	}

	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = left + (right - left) / 2;
			// Sort first and second halves
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			// Merge the sorted halves
			merge(arr, left, mid, right);

		}
	}

	public static void merge(int[] arr, int left, int mid, int right) {
		// size of 2 sub-arrays
		int num1 = mid - left + 1;
		int num2 = right - mid;
		// Temp array
		int[] leftarr = new int[num1];
		int[] rightarr = new int[num2];
		// copy data to temp arrays
		for (int i = 0; i < num1; ++i)
			leftarr[i] = arr[left + i];
		for (int j = 0; j < num2; ++j)
			rightarr[j] = arr[mid + 1 + j];

		// merge the temp arrays
		int i = 0, j = 0;
		int k = left;
		while (i < num1 && j < num2) {
			if (leftarr[i] <= rightarr[j]) {
				arr[k] = leftarr[i];
				i++;
			} else {
				arr[k] = rightarr[j];
				j++;
			}
			k++;
		}
		// copy rest elements
		while (i < num1) {
			arr[k] = leftarr[i];
			i++;
			k++;
		}
		while (j < num2) {
			arr[k] = rightarr[j];
			j++;
			k++;
		}
	}

	public static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

}
