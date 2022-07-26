package codechef;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VowAnx {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    StringBuilder sb = new StringBuilder();
		    Deque<Character> q = new ArrayDeque<>();
		    
		    int i=0;
		    // forward true, reeverse false
		    boolean dir = true;
		    while(i < n){
		        if( isVowel(vowels, s.charAt(i)) ){
		            dir = !dir;
		        }
		        if(dir){
		            q.addLast(s.charAt(i));
		        }else{
		            q.addFirst(s.charAt(i));
		        }
		        i++;
		    }
		    if(dir){
		        while(!q.isEmpty()){
		            sb.append(q.removeFirst());
		        }
		        System.out.println(sb.toString());
		    }else{
		        while(!q.isEmpty()){
		            sb.append(q.removeLast());
		        }
		        System.out.println(sb.toString());
		    }
		  
		 }
	}
	
	
	
	static boolean isVowel(Set<Character> vowels, char c){
	    return vowels.contains(c);
	}
}
