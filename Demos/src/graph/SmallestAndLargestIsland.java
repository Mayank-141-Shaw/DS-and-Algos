package graph;

import java.util.*;

public class SmallestAndLargestIsland {

	public static void main(String[] args) {
		int[][] bg = {{1, 6},{2, 7}, {3, 8}, {4,9}, {2, 6}};
		
		List<List<Integer>> gb = new ArrayList<>();
		
		for(int i=0; i<bg.length; i++) {
			List<Integer> arr = new ArrayList<>();
			for(int j=0; j<bg[i].length; j++) {
				arr.add(bg[i][j]);
			}
			gb.add(arr);
		}
		
		List<Integer> res = componentsInGraph(gb);
		
		res.stream().forEach(System.out::println);

	}
	
	public static List<Integer> componentsInGraph(List<List<Integer>> gb) {
	    // Write your code here
	        HashMap<Integer, ArrayList<Integer>> map = makeAdjMap(gb);
	           
	        boolean[] visited = new boolean[Collections.max( map.keySet() ) + 1];
	        
	        List<Integer> res = new ArrayList<>();
	        res.add(Integer.MAX_VALUE);
	        res.add(2);
	        
	        Stack<Integer> stack = new Stack<>();
	        
	        for(int i=1; i<visited.length; i++){
	            if(!visited[i]){
	                visited[i] = true;
	                stack.push(i);
	                int ct = 1;
	                while(!stack.isEmpty()){
	                    int cur = stack.pop();
	                    if( map.containsKey(cur) ){
	                        for(int neighbor:map.get(cur)){
	                            if(!visited[neighbor]){
	                                visited[neighbor] = true;
	                                stack.push(neighbor);
	                                ct+=1;
	                            }
	                        }    
	                    }
	                }
	                
	                // check for max
	                if( ct > res.get(1) ) res.set(1, ct);
	                
	                // check for min
	                if( ct!=1 && ct < res.get(0) ) res.set(0, ct);
	            }
	        }
	        
	        return res;
	    }
	
	public static HashMap<Integer, ArrayList<Integer>> makeAdjMap(List<List<Integer>> gb){
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        for(List<Integer> lst: gb){
            if(!map.containsKey(lst.get(0))){
                ArrayList<Integer> arr = new ArrayList<>();
                map.put( lst.get(0) , arr);
            }
            if(!map.containsKey(lst.get(1))){
                ArrayList<Integer> arr = new ArrayList<>();
                map.put( lst.get(1) , arr);
            }
            
            map.get( lst.get(0) ).add(lst.get(1));
            map.get( lst.get(1) ).add(lst.get(0));
        }
        
        return map;
    }

}
