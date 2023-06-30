import java.util.Arrays;
import java.util.stream.Collectors;

class HeapBox{
	int[] arr;
	int size;
	int insertpos;
	HeapBox(int size){
		this.size = size;
		this.insertpos = 0;
		this.arr = new int[size];
	}
	
	void insert(int val) {
		if(insertpos < size-1) {
			this.arr[insertpos] = val;
			this.minHeapifyUp(insertpos);
			this.insertpos++;
		}
	}
	
	void minHeapifyUp(int childPos) {
		if(childPos > 0) {
			int parentId = (childPos - 1) / 2;
			if(this.arr[parentId] > this.arr[childPos]) {
				// swap them
				int temp = this.arr[parentId];
				this.arr[parentId] = this.arr[childPos];
				this.arr[childPos] = temp;
				
				// heapify with the new parent Index
				this.minHeapifyUp(parentId);
			}
		}
	}
	
	void maxHeapifyUp(int childPos) {
		if(childPos > 0) {
			int parentId = (childPos - 1) / 2;
			if(this.arr[parentId] < this.arr[childPos]) {
				// swap them
				int temp = this.arr[parentId];
				this.arr[parentId] = this.arr[childPos];
				this.arr[childPos] = temp;
				
				// heapify with the new parent Index
				this.maxHeapifyUp(parentId);
			}
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.stream(this.arr)
				.mapToObj( String::valueOf )
				.collect(Collectors.joining(","));
	}
}

public class Heap {

	public static void main(String[] args) {
		HeapBox heap = new HeapBox(10);
		
		int[] hum = { 45, 89, 1, 36, 74, 15, 10, 86, 19, 3 };
		
		for(int i:hum) {
			heap.insert(i);
		}
		
		System.out.println(heap.toString());
	}

}
