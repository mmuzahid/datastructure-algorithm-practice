import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
  private static long fibRecur(int n) {
 	if (n <= 1)
        return n;

    return fibRecur(n - 1) + fibRecur(n - 2);
  }

  public static long fib(int n) {
  	BigInteger f0 = BigInteger.ZERO;
  	BigInteger f1 = BigInteger.ONE;
  	BigInteger fib = BigInteger.ZERO;
  	
  	if (n <= 1)
        return n;

  	for (int i = 2; i <= n; i++) {
  		fib = f0.add(f1);
  		f0 = f1;
  		f1 = fib;
  	}
  	
  	return fib.longValue();
  }
  
  
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(fib(n));
    // System.out.println(fibRecur(n));// no a good option for large number

  }
}
