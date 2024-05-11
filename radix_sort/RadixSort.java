package radix_sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
	static final int bucketSize = 10;

	public static void printNow(Queue<Integer>[] bucket) {
		for (int i = 0; i < bucketSize; ++i) {
			System.out.print("Bucket " + i + " : ");
			for (Integer value : bucket[i]) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

	public static void radix_Sort(int n, int[] arr) {
		@SuppressWarnings("unchecked")
		Queue<Integer>[] bucket = new LinkedList[bucketSize];
		for (int i = 0; i < bucketSize; ++i) {
			bucket[i] = new LinkedList<Integer>();
		}

		int factor = 1;

		// 정렬할 자릿수의 크기 만큼 반복한다.
		for (int d = 0; d < 2; ++d) {
			for (int i = 0; i < n; ++i)
				bucket[(arr[i] / factor) % 10].add(arr[i]);
			printNow(bucket);
			for (int i = 0, j = 0; i < bucketSize; ++i) {
				while (!bucket[i].isEmpty()) {

					arr[j++] = bucket[i].poll();
				}
				System.out.println(Arrays.toString(arr));
			}

			factor *= 10;
			System.out.println("-------------------------------------");
		}

	}

	public static void main(String[] args) {
		int[] arr = { 28, 93, 39, 81, 62, 72, 38, 26 };
		radix_Sort(arr.length, arr);
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}

	}
}