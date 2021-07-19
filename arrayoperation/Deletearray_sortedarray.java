package arrayoperation;

public class Deletearray_sortedarray {
	private static int binarysearch(int arr[],int low, int high,int key) {
		if(high<low) {
			return -1;
		}
		int mid =(low+high)/2;
		if(key ==arr[mid]) {
			return mid;
		}
		if(key>arr[mid])
			return binarysearch(arr, (mid+1),high,key);
		return binarysearch(arr,low,(mid-1),key);
	}
	private static int deleteelement(int arr[],int n,int key) {
		int pos =binarysearch(arr,0,n-1,key);
		if(pos==-1) {
			return n;
		}
		for(int i=pos;i<n-1;i++) {
			arr[i] =arr[i+1];
		}
		return n-1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i;
	        int arr[] = { 10, 20, 30, 40, 50 };
	 
	        int n = arr.length;
	        int key = 40;
	 
	        System.out.print("Array before deletion:\n");
	        for (i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	 
	        n = deleteelement(arr, n, key);
	 
	        System.out.print("\n\nArray after deletion:\n");
	        for (i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");

	}

}
