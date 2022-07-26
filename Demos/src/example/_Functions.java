package example;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class _Functions {

	
	public static int solve(int[] arr, int n, int k){
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

        for(int val: arr){
            q.add(val);
        }

        int maxVal=Integer.MIN_VALUE, maxI = -1, maxJ=-1, maxCt = 0;
        int kVal = k, kCount = 0, kI = -1, kJ = -1;
        int curVal = q.peek(), curCount = 1, curI = 0, curJ=0;

        while(curI <= curJ && curJ < n){

            if(q.peek() != curVal){
                // that means we are getting a new value
                // that was not in cur Val
                curCount = 0;
                curI = curJ;
            }

            curVal = q.poll();
            curCount += 1;
            if(curVal != k){
                if(curVal != maxVal){
                    if( curCount > maxCt){
                        maxVal = curVal;
                        maxI = curI;
                        maxJ = curJ;
                        maxCt = curCount;
                    }
                    
                }
                else{
                    maxJ = curJ;
                    maxCt  = maxJ - maxI + 1;
                }
            }else{
                // curval is equal to k
                if(kI != -1){
                    kI = curI;
                    kCount = 1;
                }
                kJ = curJ;
                kCount = kJ - kI + 1;
            }

            curJ += 1;
        }

        if(k != maxVal){
            if(kCount > maxCt){
                return 0;
            }else{
                return maxCt-kCount+1;
            }
        }else{
        	return 0;
        }

    }
    public static void main(String args[] ) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int t = Integer.parseInt(br.readLine());
        
        List<Integer> res = new ArrayList<>();
        
        for(int i=1; i<=t; i++){
        	
        	String[] s1 = br.readLine().trim().split(" ");
        	
            int n = Integer.parseInt(s1[0]);
            int k = Integer.parseInt(s1[1]);
            
            String[] s2 = br.readLine().trim().split(" ");
            int arr[] = new int[n];
            
            for(int j=0; j<n; j++) {
            	arr[j] = Integer.parseInt(s2[j]);
            }
            
            res.add(solve(arr, n, k));
        }
        for(int val:res) {
        	System.out.println(val);
        }

    }
	
}
	       