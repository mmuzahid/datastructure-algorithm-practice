import java.util.*;

public class LCM {
	private static long lcmNaive(int a, int b) {
		for (long l = 1; l <= (long) a * b; ++l)
			if (l % a == 0 && l % b == 0)
				return l;

		return (long) a * b;
	}

	// Optimized - for each iteration lcm increased by adding larger/big number among two input.
	private static long lcmOptimized(int a, int b) {
		long product = (long) a * b;
		int big = a >= b ? a : b;
		
		long lcm = big;
		while(product > lcm) {
			if (lcm % a == 0 && lcm % b == 0)
				break;
			
			lcm += big;
		}
		
		if (lcm > product) lcm = product;
		
		return lcm;
	}

	/**
	 * a = x.gcd
	 * b = y.gcd
	 * lcm = (a * b) / gcd
	 *  
	 * */
	private static long lcm(int a, int b) {
		long product = (long) a * b;
		
		long lcm = product / gcd(a, b);

		
		return lcm;
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
		//System.out.println(lcm(714552, 374513));

		/*Stress Tes
	   	 while(true) {
	       	Random rand = new Random();
	       	int test_a = Math.abs(rand.nextInt()) % 1000 + 5;
	       	int test_b = Math.abs(rand.nextInt()) % 1000 + 5;

	       	if (lcm(test_a, test_b) != lcm_naive(test_a, test_b))  {
	       		
	       		System.out.println("MISMATCH:" + test_a + " " + test_b);

	       		break;
	       	} else {
	       		System.out.println("OK");
	       	}
	       	
	   	}t*/
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(lcm(a, b));
		//System.out.println(lcmNaive(a, b));
	}
}
