package com.samzhanggo.example.algorithm.sort;

public class BubbleSort extends SortAlgorithm{
    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for(int i=0;i<array.length-1;i++) {
            for(int j=1;j<array.length-i;j++) {
                if(array[j-1]>array[j]){
                    swap(j-1,j);
                }
            }
        }
    }
}
