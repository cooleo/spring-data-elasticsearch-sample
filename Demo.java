public class Demo {
    public static int sum(int n, int[] memo) {
        if(n <= 1)
            return n;
        if(n <= 9) {
            memo[n] = sum(n - 1, memo)  + n;
            return memo[n];
        }
        else {
            memo[n] = sum(n - 1, memo) + 1;
            return memo[n];
        }
    }
    public static int sumDP(int n) {
        int[] dp = new int[n +1];
        int sum = 0;
        for(int i = 1; i<=n; i++) {
            if(i <=9) {
                sum += i;
                dp[i] = sum;
            }  else {
                dp[i] = dp[i - 1] + 1;
            }
        }
        return dp[n];
    }
    public static void main(String args[]) {
        // 1,2,3,4,5,6,7,8,9,10,11,12
        int n = 12;
        System.out.println(sum(n + 1, new int[n  + 1])); //10 = 1, 11 = 2 1 + 2 = 3 + 45 = 48

        System.out.println(sumDP(n + 1));
    }
}
