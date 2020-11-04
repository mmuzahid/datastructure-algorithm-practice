import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        
    	int refillCount = 0;
    	int currPosition = 0;
    	int fuelInTank = tank;
    	int nextDest = stops[0];
    	int i = 0;
    	
    	while(true) {  		
    		int fuelNeeded = nextDest - currPosition;    		
    		if (fuelNeeded > fuelInTank) {
    			return -1;
    		}
    		
    		if (nextDest == dist) break;
    		
    		fuelInTank = fuelInTank - fuelNeeded;
    		currPosition = nextDest;
    		
    		nextDest = i == stops.length-1 ? dist : stops[++i];
    		if (nextDest - currPosition > fuelInTank) {
    			refillCount++;
    			fuelInTank = tank;
    		}
    		
    	} 

    	return refillCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
