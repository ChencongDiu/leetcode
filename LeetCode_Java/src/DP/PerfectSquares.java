package DP;

/*
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.
 */

//dp[n] = Min{ dp[n - i*i] + 1 },  n - i*i >=0 && i >= 1
public class PerfectSquares {
	public int numSquares(int n) {
        int [] dp = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while (i - j * j >= 0) {
                min = Math.min(min, dp[i - j * j] + 1);
                j++;
            }
            dp[i] = min;
        }
        
        return dp[n];
    }
}
