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
    
    public static void main(String[] args) {
		printFibSquareLastDigits(200);
		printFibLastDigits(200);

    }
}

