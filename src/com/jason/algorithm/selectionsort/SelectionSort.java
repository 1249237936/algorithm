package com.jason.algorithm.selectionsort;

public class SelectionSort {

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        int N = arr.length;
        //0 ~ n - 1
        //1 ~ n - 1
        //2 ~ n - 1
        for (int i = 0; i < N; i++) {
            //0 ~ n - 1
            //1 ~ n - 1
            //2 ~ n - 1
            //i ~ n - 1
            int minValueIndex = i;//i
            for (int j = i + 1; j < N; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void printSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 5, 1, 6, 8, 1, 3, 5, 7, 5, 6};
        printSort(arr);
        selectSort(arr);
        printSort(arr);
    }
}
