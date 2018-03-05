package com.samzhanggo.example.algorithm.sort;

public class InsertSort extends SortAlgorithm{
    public InsertSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for(int i=1;i<array.length;i++){
            int target = array[i];
            int j=i;
            while(j>0 && target<array[j-1]){
                array[j]=array[j-1];
                j--;
            }
            array[j] = target;
            printArray();
        }
    }
}
