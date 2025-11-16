public class Main
{
    public static int getFibo_tabulation(int[] dp, int n){
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int getFibo_memoization(int[] dp, int n){
        dp[0] = 0;
        dp[1] = 1;
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = getFibo_memoization(dp, n-1)+getFibo_memoization(dp, n-2);
        return dp[n];
    }
    
    public static int getFibo_spaceOpt(int n){
        int prev2 = 0;
        int prev = 1;
        int cur = 0 ;
        for(int i=2;i<=n;i++){
            cur = prev+prev2;
            prev2 = prev;
            prev = cur;
        }
        return cur;
        
    }public static int getFibo_recursively(int n){
        if(n<=1) return n;
        return getFibo_recursively(n-1)+getFibo_recursively(n-2);
        
    }
	public static void main(String[] args) {
	    
		System.out.println("Enter the Fibonacci number\n");
		
		int result = getFibo_recursively(5);
		System.out.println(" result is "+ result);
		int[] dp = new int[7];
		for(int i=0;i<7;i++){
		    dp[i] = -1;
		}
		int result_6 = getFibo_memoization(dp, 6);
		System.out.println(" result is "+ result_6);
		
		result_6 = getFibo_tabulation(dp, 6);
		System.out.println(" result is "+ result_6);
		
		result_6 = getFibo_spaceOpt(6);
		System.out.println(" result is "+ result_6);
	}
	// 0 1 1 2 3 5 8
}
