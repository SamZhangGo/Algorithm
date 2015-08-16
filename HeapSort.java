public class HeapSort {
	private int[] array;
	private int heapSize;
	public HeapSort(int[] array) {
		this.array = array;
		this.heapSize = array.length;
	}

	public int[] sort() {
		heapify(heapSize);
		
		for(int i=array.length-1;i>0;i--){
			int a = array[0];
			array[0] = array[i];
			array[i] = a;
			heapify(--heapSize);
		}
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		return array;
	}
	private void heapify(int size){
		for(int i = (size>>>1)-1;i>=0;i--){
			maxHeapify(i, array[i]);
		}
	}
	private void maxHeapify(int k,int e){
		int half = heapSize>>>1;
		while(k < half){
			int child = (k<<1)+1;
			int c = array[child];
			int right = child+1;
			if(right<heapSize && c<array[right]){
				c = array[right];
				child = right;
			}
			if(e>=c)
				break;
			array[k] = c;
			k = child;
		}
		array[k] = e;
	}
	public static void main(String[] args){
		int array[] = {1,4,3,5,7,9,8,6,2,0};
		HeapSort heapSort =new HeapSort(array);
		heapSort.sort();
	}
}
