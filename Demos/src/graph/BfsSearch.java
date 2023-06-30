package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class BfsSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] edges = {
				{0,1}, 
				{0,4}, 
				{1,2}, 
				{1,3}, 
				{4,2}, 
				{2,5}, 
				{2,6}, 
				{3,5}, 
				{5,6}, 
				{3,7}, 
				{5,7}
			};
		
		Map<Integer, ArrayList<Integer>> adj = toMap(edges);
		ArrayList<Integer> res1 = bfs(adj);
		ArrayList<Integer> res2 = dfs(adj);
		ArrayList<Integer> res3 = bi_dir_search(adj);
		
		System.out.println(
				res1.stream()
				.map(String::valueOf)
				.collect(Collectors.joining("->"))
			);
		
		System.out.println(
				res2.stream()
				.map(String::valueOf)
				.collect(Collectors.joining("->"))
			);
		
		System.out.println(
				res3.stream()
				.map(String::valueOf)
				.collect(Collectors.joining("->"))
			);
		
	}
	
	static ArrayList<Integer> bi_dir_search(Map<Integer, ArrayList<Integer>> adj){
		ArrayList<Integer> res = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		Set<Integer> visited = new HashSet<>();
		
		q.add(0);
		visited.add(0);
		
		while(!q.isEmpty()) {
			int cur = q.remove();
			res.add(cur);
			
			for(int neighbor:adj.get(cur)) {
				if(!visited.contains(neighbor)) {
					visited.add(neighbor);
					q.add(neighbor);
				}
			}
		}
		
		return res;
	}
	
	static ArrayList<Integer> bfs(Map<Integer, ArrayList<Integer>> adj){
		ArrayList<Integer> res = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		Set<Integer> visited = new HashSet<>();
		
		q.add(0);
		visited.add(0);
		
		while(!q.isEmpty()) {
			int cur = q.remove();
			res.add(cur);
			
			for(int neighbor:adj.get(cur)) {
				if(!visited.contains(neighbor)) {
					visited.add(neighbor);
					q.add(neighbor);
				}
			}
		}
		
		return res;
	}
	
	static ArrayList<Integer> dfs(Map<Integer, ArrayList<Integer>> adj){
		ArrayList<Integer> res = new ArrayList<>();
		Stack<Integer> s = new Stack<>();
		Set<Integer> visited = new HashSet<>();
		
		s.push(0);
		visited.add(0);
		
		while(!s.isEmpty()) {
			int cur = s.pop();
			res.add(cur);
			
			for(int neighbor:adj.get(cur)) {
				if(!visited.contains(neighbor)) {
					visited.add(neighbor);
					s.push(neighbor);
				}
			}
		}
		
		return res;
	}
	
	
	static HashMap<Integer, ArrayList<Integer>> toMap(int[][] edges){
		HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
		
		for(int[] pair:edges) {
			if( !adj.containsKey(pair[0]) ) {
				ArrayList<Integer> ll = new ArrayList<>();
				ll.add(pair[1]);
				adj.put(pair[0], ll);
			}else {
				ArrayList<Integer> ll = adj.get(pair[0]);
				ll.add(pair[1]);
				adj.put(pair[0], ll);
			}
			
			if( !adj.containsKey(pair[1]) ) {
				ArrayList<Integer> ll = new ArrayList<>();
				ll.add(pair[0]);
				adj.put(pair[1], ll);
			}else {
				ArrayList<Integer> ll = adj.get(pair[1]);
				ll.add(pair[0]);
				adj.put(pair[1], ll);
			}
		}
		return adj;
	}

}
