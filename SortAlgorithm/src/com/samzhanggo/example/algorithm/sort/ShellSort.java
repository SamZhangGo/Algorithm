package com.samzhanggo.example.algorithm.sort;

public class ShellSort extends SortAlgorithm {
    public  ShellSort(int[] array){
        super(array);
    }
    @Override
    public void sort() {
        int gap = (int) array.length/2;
        while(gap>=1) {
            System.out.println("step = " + gap);
            for(int i=gap;i<array.length;i++) {
                for(int j = i-gap;j>=0;j-=gap ){
                    if(array[j]>array[j+gap]) {
                        swap(j, j+gap);
                    }
                }
            }
            gap = gap/2;
        }
    }


}
