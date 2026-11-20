class Solution {
    public int climbStairs(int n) {
        int [] dp=new int [n+1];
        Arrays.fill(dp,-1);
        int ans =helper(n,dp);
        return ans ;
    }
    int helper(int n,int [] dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]= helper(n-1,dp)+helper(n-2,dp);
    }
}