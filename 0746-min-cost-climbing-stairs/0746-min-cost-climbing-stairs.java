class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp=new int [cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,cost.length-1,dp),minCost(cost,cost.length-2,dp));
    }
    int minCost(int [] cost,int idx,int [] dp){
        if(idx==0 || idx==1){
            return cost[idx];
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        return dp[idx]=cost[idx]+Math.min(minCost(cost,idx-1,dp),minCost(cost,idx-2,dp));
    }

}