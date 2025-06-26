package core_java_day13;

public class BubbleSortExample {
    
	public static void main(String[] args) {
        int[] arr = {2,5,1,8,3,6,2};
        
        System.out.println("Befor Sorting : ");
        for(int numArr:arr) {
        	System.out.print(numArr+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = 0; j < arr.length - 1 - i; j++) 
            {
                if (arr[j] > arr[j + 1]) {
                	
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println();
            for (int numArr : arr) {
                System.out.print(numArr + " ");
            }
        }          
        
        System.out.print("\nSorted array: \n");
        for (int numArr : arr) {
            System.out.print(numArr + " ");
        }
    }
}
