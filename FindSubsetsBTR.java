//problem: find & print all subsets of a given string.
public class FindSubsetsBTR {
	public static void findSubsets(String str, String ans, int index) {
		// base case
		if (index == str.length()) {
			if (ans.length() == 0)
				System.out.println("null");
			else
				System.out.println(ans);
			return;
		}
		
		//yes choice
		findSubsets(str, ans+str.charAt(index), index+1);
		//no choice
		findSubsets(str, ans, index+1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str = "abcd";
		findSubsets(str,"",0);

	}

}
