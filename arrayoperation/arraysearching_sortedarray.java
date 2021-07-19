package arrayoperation;

public class arraysearching_sortedarray {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int n,key;
		n= arr.length -1;
		key =30;
		System.out.println("key at index: "+binarysearch(arr,0,n,key));

	

	}

}
