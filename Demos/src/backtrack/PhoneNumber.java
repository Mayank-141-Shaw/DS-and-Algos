package backtrack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneNumber {

	public static List<String> seq;
	public static final String[] digits = { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" }; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seq = new ArrayList<>();
		PhoneNumber pn = new PhoneNumber();
		pn.getSequences("23", "", 0);
		
		System.out.println( seq.stream().collect(Collectors.joining(",")) );
	}
	
	public void getSequences(String num, String cur, int ind){
		if(ind >= num.length()) {
			seq.add(cur);
			return;
		}
		
		int curNum = num.charAt(ind) - '0';
		
		// add all the chars for the digit to the cur and increase ind by 1 recursively
		for(int i=0; i<digits[curNum].length(); i++) {
			getSequences(num, cur+digits[curNum].charAt(i), ind+1);
		}
		
	}

}
