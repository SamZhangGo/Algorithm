package com.samzhanggo.example.algorithm.sort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] array = randomizeArray(n);

//        QuickSortRecursion quickSorter = new QuickSortRecursion(array);
//        quickSorter.sort();
//        QuickSortNonrecursion quickSortNonrecursion = new QuickSortNonrecursion(array);
//        quickSortNonrecursion.sort();

        ShellSort shellSort = new ShellSort(array);
        shellSort.sort();
//        InsertSort insertSort = new InsertSort(array);
//        insertSort.sort();
//        SelectionSort selectionSort = new SelectionSort(array);
//        selectionSort.sort();
//        HeapSort heapSort = new HeapSort(array);
//        heapSort.sort();
//        BubbleSort bubbleSort = new BubbleSort(array);
//        bubbleSort.sort();
//        RecursiveMergeSort recursiveMergeSort = new RecursiveMergeSort(array);
//        recursiveMergeSort.sort();
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
