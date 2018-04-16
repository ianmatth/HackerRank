import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stock {

    static long stockmax(long[] prices) {
        
        int days = prices.length;
        boolean[] sell = new boolean[days];

		long price = Long.MIN_VALUE;
        for (int i = days - 1; i >= 0; i--) {
			if (price < prices[i]) { 
				price = prices[i]; 
				sell[i] = true; 
			}
		}
        
		long buy = 0; 
        long profit = 0;
		int shares = 0;

		for (int i = 0; i < days; i++) {
			if (sell[i] == false) { 
				buy += prices[i];
				shares++;
			} else if (buy != 0) { 
				profit += shares * prices[i] - buy; 
				buy = 0;
				shares = 0;
			}
		}
		return profit;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long[] prices = new long[n];
            for(int prices_i = 0; prices_i < n; prices_i++){
                prices[prices_i] = in.nextInt();
            }
            long result = stockmax(prices);
            System.out.println(result);
        }
        in.close();
    }
}
