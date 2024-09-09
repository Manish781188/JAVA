

public class binary_search {
	
	static boolean search(int arr[],int key) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
		int  mid = (start+end)/2;
		if(key==arr[mid]) {
			return true;
		}
		else if(key>arr[mid]) {
			start=mid+1;
		}
		else {
			end = mid-1;
		}
		}
		return false;
		}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		int key =6 ;
		System.out.println(search(arr,key));
	}
		
		
	}

