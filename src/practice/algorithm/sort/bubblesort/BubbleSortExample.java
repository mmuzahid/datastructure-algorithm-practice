package practice.algorithm.sort.bubblesort;

import java.util.Arrays;

public class BubbleSortExample {

	public static void main(String args[]) {
		int[] ages = { 5, 1, 17, 3, 80, 35 };
		doBubbleSortAsc(ages, true);
		System.out.println(Arrays.toString(ages));
	}

	private static void doBubbleSortAsc(int[] items, boolean printStep) {
		int swapTemp;
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - 1; j++) {
				if (printStep) {
					System.out.printf("Phase:i=%d, j=%d %s", i, j, Arrays.toString(items));
				}
				if (items[j] > items[j + 1]) {
					if (printStep) {
						System.out.printf(" -> swap(item[%d]=%d, item[%d]=%d)", j, items[j], j + 1,
								items[j + 1]);
					}
					swapTemp = items[j];
					items[j] = items[j + 1];
					items[j + 1] = swapTemp;
				}
				if (printStep) {
					System.out.printf(" -> %s\n", Arrays.toString(items));
				}
			}
		}
	}

}
