package codechef.contest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Antiknapsack {
	
	static int countLatticePoints(int[][] circles) {
		int res = 0;
        Map<Integer, Set<Integer>> data = new HashMap<>();
        System.out.println("Length : "+circles.length);
        for(int i=0; i<circles.length; i++){
            
            int x = circles[i][0];
            int y = circles[i][1];
            int r = circles[i][2];
            int r2 = r*r;
            System.out.println(x+","+y+","+r);
            
            for(int j=x-r; j<=x; j++){
                for(int k=y-r; k<=y; k++){
                    if(Math.pow(j-x, 2) + Math.pow(k-y, 2) <= r2) {
                    	if(data.get(j)==null) {
                    		Set<Integer> set = new HashSet<>();
                    		set.add(k);
                    		data.put(j, set);
                    		res++;
                    	}else {
                    		Set<Integer> set = data.get(j);
                    		if(!set.contains(k)) res++;
                    		set.add(k);
                    		data.put(j, set);
                    	}
                    	
                    }
                }
            }
        }
        
        return res;
    }
	
	public static void main(String args[]) throws Exception {
		
		int[][] circles = {{2,2,2}, {3,4,1}};
		System.out.println(countLatticePoints(circles));
	}
}
