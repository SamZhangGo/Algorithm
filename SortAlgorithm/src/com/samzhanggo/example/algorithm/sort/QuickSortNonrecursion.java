package com.samzhanggo.example.algorithm.sort;

import java.util.Stack;

public class QuickSortNonrecursion extends SortAlgorithm{
    public QuickSortNonrecursion(int[] array){
        super(array);
    }
    @Override
    public void sort() {
        nonRecursiveSort();
    }

    private void nonRecursiveSort(){
        Stack<Integer> index = new Stack<Integer>();
        int start = 0;
        int end = array.length - 1;
        int pivotPos;
        push(index,start);
        push(index,end);
        while(!index.isEmpty()) {
            end = pop(index);
            start = pop(index);
            pivotPos = partition(array,start, end);
            printArray();
            if(start < pivotPos -1){
                push(index,start);
                push(index,pivotPos-1);
            }
            if(end>pivotPos + 1) {
                push(index,pivotPos + 1);
                push(index,end);
            }
        }
    }

    private int partition(int[]a, int start, int end) {
        int pivot = a[start];
        System.out.println("主元："+ pivot);
        while(start<end) {
            while(start< end && a[end]>=pivot) end--; //从右往左找到第一个小于pivot的元素
            a[start] = a[end];
            while(start<end && a[start]<=pivot) start++;//从左往右找到第一个大于pivot的元素
            a[end] = a[start];
        }
        a[start]=pivot;
        return start;
    }

    private void push(Stack<Integer> stack, int index) {
        stack.push(index);
        System.out.println("push: " +index+"("+array[index]+")");
    }
    private int pop(Stack<Integer> stack) {
        int index = stack.pop();
        System.out.println("pop: "+ index+"("+array[index]+")");
        return index;
    }
}
