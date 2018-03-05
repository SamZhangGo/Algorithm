package com.samzhanggo.example.algorithm.sort;

public class SelectionSort extends SortAlgorithm{
    public SelectionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for(int i = 0;i<array.length-1;i++) {
            int minIndex = i;
            int min = array[i];
            int j = i+1;
            for(;j<array.length;j++) {
                if(min>array[j]){
                    minIndex = j;
                    min= array[j];
                }
            }
            if(minIndex!= i){
                swap(minIndex, i);
            }
        }
    }
}
