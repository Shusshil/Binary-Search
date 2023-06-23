package Binary_Search;

public class Sub_Sequence_of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSequence("str");
	}
	public static void SubSequence(String str) {
	    SubSequence(str,0 , "");
	}
	public static void SubSequence(String str, int i, String currStr) {
	    if(i==str.length()) {
	    System.out.println(currStr);
	    return ;
	    }
	    SubSequence(str, i+1, currStr+str.charAt(i));
	    SubSequence(str, i+1, currStr);
	}
}
