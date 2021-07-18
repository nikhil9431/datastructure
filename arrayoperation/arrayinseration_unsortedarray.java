package arrayoperation;

public class arrayinseration_unsortedarray {
	private static int insertelemnt(int arr[],int n,int key,int capacity) {
		if(n>capacity) {
			return n;
		}
		arr[n]=key;
		return n+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[20];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		
		int capacity =20;
		int n=7;
		int key =80;
		System.out.println("Before inseration: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+ " ");
			
		}
		
		n=insertelemnt(arr,n,key,capacity);
			System.out.println("\n After inseration: ");
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]+" ");
			}
		}

	}


