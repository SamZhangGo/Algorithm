package com.samzhanggo.example.algorithm.sort;

public class RecursiveMergeSort extends SortAlgorithm {
    public RecursiveMergeSort(int[] array){
        super(array);
    }

    @Override
    public void sort() {
    mergeSort(array, 0,array.length-1);
    }

    private void mergeSort(int[] a ,int low , int high){
        int mid = (low+high)/2;
        if(low<high){
            mergeSort(a, low, mid);
            mergeSort(a,mid+1, high);
            merge(a,low, mid, high);
        }
    }
    private void merge(int[] a, int low , int mid, int high){
        System.out.println("merge low="+low + ", high=" + high);
        printArray(low, high);
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while(i<=mid){
            temp[k++] = a[i++];
        }
        while(j<=high){
            temp[k++] = a[j++];
        }
        for(int x=0;x<temp.length;x++) {
            a[x+low] = temp[x];
        }
        printArray();
    }
}
