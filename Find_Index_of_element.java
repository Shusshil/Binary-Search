package Binary_Search;

public class Find_Index_of_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr={1,2,4,7,9,10,13,15};
		System.out.println(FindIndex(arr, 5));
	}
	public static int FindIndex(int[] arr, int target) {
	    int start=0;
	    int end=arr.length-1;
	    while(start<=end) {
	        int mid=start+(end-start)/2;
	        
	        if(arr[mid]==target)
	        return mid;
	        
	        if(arr[mid]>target)
	        end=mid-1;
	        
	        else start=mid+1;
	    }
	    return start;
	}
}
