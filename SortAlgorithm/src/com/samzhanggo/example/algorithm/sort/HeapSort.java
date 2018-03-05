package com.samzhanggo.example.algorithm.sort;

public class HeapSort extends SortAlgorithm {
    private int heapSize;
    public HeapSort(int[] array){
        super(array);
        this.heapSize = array.length;
    }

    @Override
    public void sort() {
        heapify(heapSize);
        for(int i=array.length -1 ;i>0;i--) {
            swap(0,i);
            heapify(--heapSize);
        }
    }

    private void heapify(int size) {
        for(int i= (size>>>1)-1;i>=0;i--){
            maxHeapify(i,array[i]);
        }
    }

    private void maxHeapify(int k , int e) {
        int half = heapSize>>>1;
        while(k<half) {
            int child = (k<<1)+ 1;
            int c = array[child];
            int right = child+1;
            if(right<heapSize && c<array[right]){
                c = array[right];
                child = right;
            }
            if(e>=c) {
                break;
            }
            array[k] = c;
            k = child;
        }
        array[k] = e;
    }
}
