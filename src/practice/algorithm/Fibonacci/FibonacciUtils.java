import java.math.BigInteger;
import java.util.*;

public class FibonacciLastDigitsPattern {
    
    public static void printFibSquareLastDigits(long n) {
    	BigInteger f0 = BigInteger.ZERO;
    	BigInteger f1 = BigInteger.ONE;
    	BigInteger fib;
		System.out.print (f0 + " ");
		System.out.print (f1 + " ");

    	for (long i = 2; i <= n; i++) {
    		fib = f0.add(f1);
    		f0 = f1;
    		f1 = fib;
       	 	System.out.print(fib.multiply(fib).mod(new BigInteger("10"))+ " ");
    	}
    	
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
 
    /**
    * returns a reapeated frame of (fib % m) as mod result repeats
    */
    public static List<Long> getModFrame(long m) {
		BigInteger f0 = BigInteger.ZERO;
		BigInteger f1 = BigInteger.ONE;
		BigInteger fib;

		List<Long> frames = new ArrayList<Long>();
		frames.add(0l);
		frames.add(1l);
		long prev = 1l;
		while (true) {
			fib = f0.add(f1);
			f0 = f1;
			f1 = fib;
			long mod = fib.mod(new BigInteger(String.valueOf(m))).longValue();
			frames.add(mod);

			if (mod == 1 && prev == m - 1) {
				break;
			} else {
				prev = mod;
			}
		}

		return frames;

	}
	
    
    public static void main(String[] args) {
		printFibSquareLastDigits(200);
		printFibLastDigits(200);
		getModFrame(3);
    }
}

