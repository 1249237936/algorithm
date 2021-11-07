package com.jason.algorithm.selectionsort;

public class SelectionSort {


	public static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	public static void selectSort(int[] arr) {
		if (arr == null || arr.length < 2) return;

		int N = arr.length;
		for (int i = 0; i < N; i++) {
			int minValueIndex = i;
			for (int j = i + 1; j < N; j++) {
				minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
			}
			swap(arr, i, minValueIndex);
		}

	}

	public static void bubbleSort(int[] arr) {
		if (arr == null || arr.length < 2) return;
		int N = arr.length;
		for (int end = N - 1; end >= 0; end--) {
			for (int second = 1; second <= end; second++) {
				if (arr[second - 1] > arr[second]) {
					swap(arr, second - 1, second);
				}
			}
		}
	}

	public static void insertSort(int[] arr) {
		if (arr == null || arr.length < 2) return;
		//0 ~ 0 完成
		//0 ~ 1
		//0 ~ 2
		//0 ~ 3
		//0 ~ n-1
		int N = arr.length;
		for (int end = 1; end < N; end++) {
			int newNumIndex = end;
			//左边有数，并且左边比右边大
			while (newNumIndex - 1 >= 0 && arr[newNumIndex - 1] > arr[newNumIndex]) {
				swap(arr, newNumIndex - 1, newNumIndex);
				newNumIndex--;
			}
		}
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
		//selectSort(arr);
		//bubbleSort(arr);
		insertSort(arr);
		printSort(arr);
	}
}
