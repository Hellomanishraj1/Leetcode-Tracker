class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp=new int [cost.length];
        Arrays.fill(dp,-1);
        int last=minCost(cost,cost.length-1,dp);
        int secondLast=minCost(cost,cost.length-2,dp);
        return Math.min(last,secondLast);
    
    }
    int minCost(int [] cost,int i,int [] dp){
        if(i==0 || i==1){
            return cost[i];
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=cost[i]+Math.min(minCost(cost,i-1,dp),minCost(cost,i-2,dp));
    }
}