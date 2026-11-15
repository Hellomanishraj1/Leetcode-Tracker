class Solution {
    public int rob(int[] nums) {
        int [] dp=new int [nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    int helper(int [] arr,int i,int [] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
      return   dp[i]=Math.max(arr[i]+helper(arr,i+2,dp),helper(arr,i+1,dp));
    } 
}