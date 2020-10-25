import java.util.*;

public class GCD {
	private static int gcdNaive(int a, int b) {
		int current_gcd = 1;
		for (int d = 2; d <= a && d <= b; ++d) {
			if (a % d == 0 && b % d == 0) {
				if (d > current_gcd) {
					current_gcd = d;
				}
			}
		}

		return current_gcd;
	}

	// Euclidean Algorithm
	private static int gcd(int a, int b) {
		int gcd = 1;

		int big = a >= b ? a : b;
		int small = a >= b ? b : a;

		while (true) {
			if (small == 0 || big == 0) {
				gcd = 1;
				break;
			}
			if (big % small == 0) {
				gcd = small;
				break;
			}

			int reminder = big % small;
			big = small;
			small = reminder;
		}

		return gcd;
	}

	public static void main(String args[]) {

		// TLE: test case - System.out.println(gcd(707459358, 1451906588));
		/*Stress Test
	   	 while(true) {
	       	Random rand = new Random();
	       	int test_a = Math.abs(rand.nextInt()) % 1000 + 5000000;
	       	int test_b = Math.abs(rand.nextInt()) % 1000 + 5000000;

	       	if (gcd(test_a, test_b) != gcdNaive(test_a, test_b))  {
	       		
	       		System.out.println("MISMATCH:" + test_a + " " + test_b);

	       		break;
	       	} else {
	       		System.out.println("OK");
	       	}
	       	
	   	}*/
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		//System.out.println(gcdNaive(a, b));
		System.out.println(gcd(a, b));

	}
}
