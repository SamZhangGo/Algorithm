package com.samzhanggo.example.algorithm.sort;

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
    /*以最后一个元素为主元，从左到右找到第一个大于主元的元素，用i来记录其位置，然后继续向右找到小于主元的，进行交换*/
    private int partition(int begin,int end){
        int c = array[end];
        System.out.println("主元 "+end+"("+c+")");
        int i = begin-1;
        System.out.println("from "+begin+" to " + end);
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
            System.out.println("swap position " + i+"("+array[i]+") and position "+j+"("+array[j]+")");
            int c = array[i];
            array[i] = array[j];
            array[j] = c;
            printArray();
        }

    }
    private void printArray(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }

}
