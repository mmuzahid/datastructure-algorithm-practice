import java.math.BigInteger;
import java.util.*;

public class FibonacciLastDigitsPartialSum {
	private static long getFibonacciPartialSumNaive(long from, long to) {
		long sum = 0;

		long current = 0;
		long next = 1;

		for (long i = 0; i <= to; ++i) {
			if (i >= from) {
				sum += current;
			}

			long new_current = next;
			next = next + current;
			current = new_current;
		}

		return sum % 10;
	}
    
	public static void printFibLastDigits(long n) {
    	BigInteger f0 = BigInteger.ZERO;
    	BigInteger f1 = BigInteger.ONE;
    	BigInteger fib;
		System.out.print (f0 + " ");
		System.out.print (f1 + " ");

    	for (long i = 2; i <= n; i++) {
    		fib = f0.add(f1);
    		f0 = f1;
    		f1 = fib;
       	 	System.out.print(fib.mod(new BigInteger("10")) + " ");
    	}
    	
    }
	private static long getFibonacciPartialSum(long from, long to) {
		int[] lastDigits = { 0, 1, 1, 2, 3, 5, 8, 3, 1, 4, 5, 9, 4, 3, 7, 0, 7, 7, 4, 1, 5, 6, 1, 7, 8, 5, 3, 8, 1, 9,
				             0, 9, 9, 8, 7, 5, 2, 7, 9, 6, 5, 1, 6, 7, 3, 0, 3, 3, 6, 9, 5, 4, 9, 3, 2, 5, 7, 2, 9, 1 };
		long sum = 0;
		
		if (from > to) {
			long temp = from;
			from = to;
			to = temp;
		}
		from = from % lastDigits.length; // all last digits sum is ZERO... do it manually to test
		to = to % lastDigits.length;

		if (from <= to) {
			for (long i = from; i <= to; ++i) {
				sum += lastDigits[(int) (i% lastDigits.length)];
				sum = sum % 10;
			}
		} else {
			for (long i = from; i <= lastDigits.length; ++i) {
				sum += lastDigits[(int) (i% lastDigits.length)];
				sum = sum % 10;
			}
			
			for (long i = 0; i <= to; ++i) {
				sum += lastDigits[(int) (i% lastDigits.length)];
				sum = sum % 10;
			}
		}

		return sum;
	}

	public static void main(String[] args) {

		
//		  System.out.println(getFibonacciPartialSum(3, 7));
//		  System.out.println(getFibonacciPartialSum(10, 10));
//		  System.out.println(getFibonacciPartialSum(10, 200));
//		 System.out.println(getFibonacciPartialSum(1, 10000000000l));
//    	System.out.println(getFibonacciPartialSum(5618252, 6583591534156l));
//	
    	

		Scanner scanner = new Scanner(System.in);
		long from = scanner.nextLong();
		long to = scanner.nextLong();
		System.out.println(getFibonacciPartialSum(from, to));

	}
}
