package core_java_day14;

class BinarySearch {
	  int binarySearch(int array[], int x, int low, int high) {
	 
	    if (high >= low) {
	      int mid = low + (high - low) / 2;
	 
	      // If found at mid, then return it
	      if (x == array[mid])
	        return mid;
	 
	      // Search the right half
	      if (x > array[mid])
	        return binarySearch(array, x, mid + 1, high);
	 
	      // Search the left half
	      return binarySearch(array, x, low, mid - 1);
	    }
	 
	    return -1;
	  }
	 
	  public static void main(String args[]) {
	    BinarySearch ob = new BinarySearch();
	    int array[] = { 3, 4, 5, 6, 7, 8, 9 };
	    int n = array.length;
	    int x = 4;
	    int result = ob.binarySearch(array, x, 0, n - 1);
	    if (result == -1)
	      System.out.println("Not found");
	    else
	      System.out.println("Element found at index " + result);
	  }
	}