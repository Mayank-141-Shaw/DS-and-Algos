package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Dijkstra {

	public static void main(String[] args) {
		Map<Integer, ArrayList<ArrayList<Integer>>> adj = new HashMap<>();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		ArrayList<Integer> pair = new ArrayList<>();
		pair.add(1);pair.add(1);
		arr.add(pair);
		pair= new ArrayList<>();
		pair.add(2);pair.add(6);
		arr.add(pair);
		pair= new ArrayList<>();
		adj.put(0, arr);
		arr = new ArrayList<>();
		
		pair.add(2);pair.add(3);
		arr.add(pair);
		pair= new ArrayList<>();
		pair.add(0);pair.add(1);
		arr.add(pair);
		pair= new ArrayList<>();
		adj.put(1, arr);
		arr= new ArrayList<>();
		
		pair.add(1);pair.add(3);
		arr.add(pair);
		pair= new ArrayList<>();
		pair.add(0);pair.add(6);
		arr.add(pair);
		pair= new ArrayList<>();
		adj.put(2, arr);
		arr= new ArrayList<>();
		
		int src = 2;
		Dijkstra djk = new Dijkstra();
		int[][] dp = djk.dijkstra(3, src, adj);
		
		// distance
		System.out.println("Distance from "+ src);
		for(int i=0; i<3; i++) {
			System.out.print(dp[0][i]+" ");
		}
		System.out.println();
		
		// parent
		System.out.println("Who is its parent");
		for(int i=0; i<3; i++) {
			System.out.print(dp[1][i]+" ");
		}
	}
	
	int[][] dijkstra(int V, int src, Map<Integer, ArrayList<ArrayList<Integer>>> adj){
		int[][] dist_parent = new int[2][V];
		// initialize distance and parent
		Arrays.fill(dist_parent[0], Integer.MAX_VALUE);
		Arrays.fill(dist_parent[1], -1);
		
		PriorityQueue<Node> q = new PriorityQueue<>((a,b) -> a.w-b.w);
		
		// init src to 0 and add it in queue
		dist_parent[0][src] = 0;
		q.add(new Node(src, 0));
		
		while(!q.isEmpty()) {
			// pull the node with min weight
			Node uNode = q.poll();
			int u = uNode.v;
			
			// visit the u neighbors
			for(ArrayList<Integer> vNode : adj.get(u)) {
				int v = vNode.get(0);
				int w = vNode.get(1);
				
				// condition check for relaxation
				if( dist_parent[0][v] > dist_parent[0][u] + w ) {
					// remove any node that contains v
					q.remove( new Node(v, dist_parent[0][v] ) );
					
					// update dist and queue
					dist_parent[0][v] = dist_parent[0][u] + w;
					dist_parent[1][v] = u;
					q.add(new Node( v, dist_parent[0][v] ));
				}
				// else do nothing
			}
		}
		
		return dist_parent;
	}
	
	class Node{
		int v, w;
		Node(int v, int w){
			this.v = v;
			this.w = w;
		}
	}

}
