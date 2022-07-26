package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SubsetSum {
	
	public static void main(String args[]) throws Exception{
		int[] arr = {1,2,3,4};
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.stream(arr).forEach( val -> {
			list.add(val);
		});
		
		subsetSum(list);
	}
	
	static void subsetSum(ArrayList<Integer> list) {
		subsetSumUtil(list, 0, 7);
	}
	
	static int subsetSumUtil(ArrayList<Integer> list, int temp, int k) {
		if(list.size() == 1) {
			if(temp + list.get(0) == k) {
				System.out.println(list.get(0)+" ");
				return list.get(0);
			}
			return 0;
		}
		
		
		
		int i = 0;
		while(list.size() > 0) {
			int peek = list.get(i);
			System.out.println(i+" "+peek+" "+ list.size());
			ArrayList<Integer> newList = new ArrayList<>();
			newList.addAll(list.subList(i+1, list.size()));
			if(subsetSumUtil(newList, temp + peek, k) != 0) {
				System.out.print(peek + " ");
				return peek;
			}
			i++;
		}
		return 0;
	}
}
