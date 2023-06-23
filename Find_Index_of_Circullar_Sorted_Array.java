package Binary_Search;

public class Find_Index_of_Circullar_Sorted_Array {

	public static void main(String[] args) {
		int[] arr={6,7,8,9,1,2,3,4,5};
		System.out.println(Find(arr, 4));
	}
	public static int Find(int[] arr, int target) {
	    int start=0;
	    int end=arr.length-1;
	    while(start<=end) {
	        int mid=start+(end-start)/2;
	        if(arr[mid]==target)
	        return mid;
	        
	        if(arr[mid]>=target) {
	            if(target>=arr[start] && target<arr[mid]) {
	            end=mid-1;
	            }
	            else
	            start=mid+1;
	            
	        }
	        if(arr[mid]<=target) {
	            if(target<=arr[end] && target>arr[mid]) {
	                start=mid+1;
	            }
	                else
	                end=mid-1;
	        }
	    }
	    return -1;
	}

}
