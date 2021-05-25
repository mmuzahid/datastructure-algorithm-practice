import java.util.*; 
import java.io.*;

class CoinDeterminer {

  public static int CoinDeterminer(int amount) {
    int[] coins = {1,5,7,9,11};
    int[] counter = new int[amount+1];

    for (int coin :  coins) {
        for (int i = 1; i <= amount; i++) {
          if (coin ==  1) {
            counter[i] = counter[i-1] + 1;
          } else if (i - coin >= 0 && counter[i] > (counter[i - coin] + 1) ) {
            counter[i] = counter[i - coin] + 1;
          }  
          
          
        }
        

    }


    return counter[amount];
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CoinDeterminer(s.nextLine())); 
  }

}

/*

Coin Determiner
Have the function CoinDeterminer(num) take the input, which will be an integer ranging from 1 to 250, and return an integer output that will specify the least number of coins, that when added, equal the input integer. Coins are based on a system as follows: there are coins representing the integers 1, 5, 7, 9, and 11. So for example: if num is 16, then the output should be 2 because you can achieve the number 16 with the coins 9 and 7. If num is 25, then the output should be 3 because you can achieve 25 with either 11, 9, and 5 coins or with 9, 9, and 7 coins.
Examples
Input: 6
Output: 2
Input: 16
Output: 2
Browse Resources
Search for any help or documentation you might need for this problem. For example: array indexing, Ruby hash tables, etc.





*/
