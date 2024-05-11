package insertion_sort;

import java.io.IOException;
import java.util.Arrays;

public class Insertion_Sort {

	public static void insertion_sort(int[] a) {
		insertion_sort(a, a.length);
		System.out.println("n = " + a.length);
	}

// O(n) - O(n^2) - O(n^2)

	private static void insertion_sort(int[] a, int size) {
		for (int j = 1; j < size; j++) {
			System.out.println(j);
			int key = a[j];

			int i = j - 1;

			while (i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}
	}

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println("★★★★★정렬 전 배열★★★★★\n" + Arrays.toString(arr) + "\n");
		insertion_sort(arr);
		System.out.println("\n★★★★★정렬 후 배열★★★★★\n" + Arrays.toString(arr));
	}
}