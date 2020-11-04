import java.util.Scanner;

public class Change {
	private static int TEN = 10;
	private static int FIVE = 5;
	private static int ONE = 1;

	private static int sortedNotes[] = { TEN, FIVE, ONE };

	private static int getChange(int m) {
		int noteCount = 0;
		for (int note : sortedNotes) {
			while (m >= note) {
				m = m - note;
				noteCount++;
			}
		}

		return noteCount;
	}

	public static void main(String[] args) {
		/*
		 * System.out.println(getChange(0)); 
		 * System.out.println(getChange(2));
		 * System.out.println(getChange(28));
		 */

		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println(getChange(m));

	}
}
