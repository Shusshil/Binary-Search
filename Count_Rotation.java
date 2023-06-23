package Binary_Search;

public class Count_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={6,7,8,9,1,2,3,4,5};
		System.out.println(RotationCount(arr));
	}
	public static int RotationCount(int[] arr) {
		int n = arr.length;
	    int start=0;
	    int end=n-1;
	    while(start<=end) {
	        int mid=start+(end-start)/2;
	        int prev=((mid-1)+n)%n;
	        int next=(mid+1)%n;
	        if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]) 
	            return mid;
	  
	        if(arr[mid]<=arr[end])
	        end=mid-1;
	        
	        else if(arr[mid]>=arr[start])
	        start=mid+1;
	    } 
	    return -1;
	}
}
