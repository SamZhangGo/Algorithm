package com.samzhanggo.example.algorithm.sort;

public abstract class SortAlgorithm {
    protected int[] array;
    public SortAlgorithm(int[] array) {
        this.array = array;
    }
    public abstract void sort();

    public void printArray(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }

    public void printArray(int from , int to){
        if(from>to)
            return;
        from = from >0?from:0;
        to = to>array.length-1?array.length-1:to;
        for(int i=from;i<=to;i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }

    public void swap(int i, int j) {
        if (i != j) {
            System.out.println("swap position " + i + "(" + array[i] + ") and position " + j + "(" + array[j] + ")");
            int c = array[i];
            array[i] = array[j];
            array[j] = c;
            printArray();
        }
    }
}
