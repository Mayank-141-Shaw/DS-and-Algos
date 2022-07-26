package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutations {
	
	static List<String> list = new ArrayList<>();
	
    public static void main(String args[]) throws Exception{
    	System.out.println(find_permutation("ABCD"));
    }
    
    static List<String> find_permutation(String S) {
        f(S, "");
        Set<String> set = new HashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
    
    static void f(String rem, String cur){
        if(rem.length()==0){
            list.add(cur);
            return;
        }
        
        for(int i=0; i<rem.length(); i++){
            char ch = rem.charAt(i);
            f(rem.substring(0,i)+rem.substring(i+1), cur+ch);
        }
    }
}
