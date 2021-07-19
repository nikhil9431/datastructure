package arrayoperation;

public class arrayinseration_sortedarray {
	 static int insertSorted(int arr[], int n, int key, int capacity)
	    {
	        if (n >= capacity) {
	            return n;
	        }
	 
	        int i;
	        for (i = n - 1; (i >= 0 && arr[i] > key); i--) {
	            arr[i + 1] = arr[i];
	        }
	        arr[i + 1] = key;
	 
	        return (n + 1);
	    }
	 

	public static void main(String[] args) {
		 int arr[] = new int[20];
	        arr[0] = 10;
	        arr[1] = 20;
	        arr[2] = 30;
	        arr[3] = 40;
	        arr[4] = 60;
	        arr[5] = 70;
	        int capacity = arr.length;
	        int n = 6;
	        int key = 50;
	 
	        System.out.print("Before Insertion: ");
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	 
	        n = insertSorted(arr, n, key, capacity);
	 
	        System.out.print("After Insertion: ");
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
		
	}

}
