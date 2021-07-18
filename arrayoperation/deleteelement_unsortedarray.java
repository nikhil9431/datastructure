package arrayoperation;

public class deleteelement_unsortedarray {
	
	private static int findelement(int arr[],int n, int key){
		
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
      
        return -1;
    
	}
	
	private static int deletelement(int arr[],int n,int key) {
		int pos= findelement(arr,n,key);
		if(pos == -1) {
			System.out.println("element not found");
			return n;
		}
	
	
	for(int i =pos;i<n-1;i++) 
		arr[i]=arr[i+1];
	return n-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int n=arr.length;
		int key=40;
		System.out.println("array before deletion: ");
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]+ " ");
		}
		n=deletelement(arr,n,key);
		
		System.out.println("\n array after deletion: ");
		for(int i=0; i<n;i++)
			System.out.println(arr[i]+" ");
		

	}

}
