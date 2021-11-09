package com.jason.algorithm.rangesum;

/**
 * 数组累加
 */
public class RangeSum {

	private int[] preSum;

	public RangeSum(int[] array) {
		int N = array.length;
		preSum = new int[N];
		preSum[0] = array[0];
		for (int i = 1; i < N; i++) {
			preSum[i] = preSum[i - 1] + array[i];
		}
	}

	public int rangeSum(int L, int R) {
		return L == 0 ? preSum[R] : preSum[R] - preSum[L - 1];
	}

}
