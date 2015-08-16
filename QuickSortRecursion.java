
public class QuickSortRecursion {
	private int[] array;
	public QuickSortRecursion(int[] array){
		this.array = array;
	}
	public void sort(){
		quickSort(0, array.length-1);
		printArray();
	}
	private void quickSort(int begin, int end){
		if(begin<end){
			int pos = partition(begin, end);
			quickSort(begin, pos-1);
			quickSort(pos+1, end);
		}
	}
	private int partition(int begin,int end){
		int c = array[end];
		int i = begin-1;
		for(int j=begin;j<end;j++){
			if(array[j]<=c){
				i++;
				swap(i, j);
			}
		}
		swap(i+1, end);
		return i+1;
	}
	private void swap(int i, int j){
		if(i!=j){
			int c = array[i];
			array[i] = array[j];
			array[j] = c;
		}
		
	}
	private void printArray(){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"  ");
		}
	}
	public static void main(String[] args ) throws Exception{
		int[] array = randomizeArray(10);
		
		QuickSortRecursion quickSorter = new QuickSortRecursion(array);
		
		quickSorter.sort();
	}
	private static int[] randomizeArray(int length){
		int[] array = new int[length];
		for(int i=0;i<length;i++){
			array[i] = (int) (Math.random()*10);
			System.out.print(array[i]+"  ");
		}
		System.out.println();	
		return array;
	}
}
