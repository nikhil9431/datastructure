package arrayoperation;

public class arraysearching_unsortedarray {
	
	 private static int findelement(int arr[],int n,int key) {
		for(int i=0;i<n;i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int n=arr.length;
		
		int key =40;
		int pos =findelement(arr,n,key);
		
		if(pos ==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("element found at position: "+(pos+1));
		}

	}

}
