import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
        	items.add(new Item(values[i], weights[i]));
        }
        Collections.sort(items,  (item, otherItem) -> otherItem.getUnitValue().compareTo(item.getUnitValue()));
        
        for (Item item : items) {
        	int allowedWeight = Math.min(item.getWeight(), capacity);
        	value += allowedWeight * item.getUnitValue();
        	capacity -= allowedWeight;
        }
 
        return value;
    }

    /**
     input: 
        3 50
        60 20
        100 50
        120 30
      output:
        180.0000
    */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(String.format("%.4f",getOptimalValue(capacity, values, weights)));   
    }
} 

class Item {
	private int value;
	private int weight;
	private Double unitValue;
	public Item(int value, int weight) {
		this.value = value;
		this.weight = weight;
		this.unitValue =  ((double)value / weight);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Double getUnitValue() {
		return unitValue;
	}
}
