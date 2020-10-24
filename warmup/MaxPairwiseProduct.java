import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static int getMaxPairwiseProductBrute(int[] numbers) {
        int max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product,
                    numbers[first] * numbers[second]);
            }
        }

        return max_product;
    }
    
    static long getMaxPairwiseProduct(int[] numbers) {
        int n = numbers.length;

        if (n < 2) return 0;
        int max1 = numbers[0] >= numbers[1] ? numbers[0] : numbers[1];
        int max2 = numbers[0] >= numbers[1] ? numbers[1] : numbers[0];

        for (int i = 2; i < n; ++i) {
            if (numbers[i] >= max1) {
            	max2 = max1;
            	max1 = numbers[i];
            } else if (numbers[i] > max2) {
            	max2 = numbers[i];
            }
        }

        return (long) max1 * max2;
    }
    public static void main(String[] args) {
    	/* Stress Test
      while(true) {
        	Random rand = new Random();
        	int count = Math.abs(rand.nextInt()) % 3;

        	int[] test_numbers = new int[count];
        	for (int i = 0; i < count; i++) {
        		test_numbers[i] = - Math.abs(rand.nextInt()) % 3 + 200000;
            }
        	if (getMaxPairwiseProduct(test_numbers) != getMaxPairwiseProductBrute(test_numbers))  {
        		
        		System.out.println("MISMATCH");

        		System.out.println(Arrays.toString(test_numbers));
        		long s1 = getMaxPairwiseProduct(test_numbers);
        		long s2 = getMaxPairwiseProductBrute(test_numbers);
        		
        		System.out.println( s1 + " : " +  s2);

        		
        		break;
        	} else {
        		System.out.println("OK");
        	}
        	
    	}*/

    	FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
