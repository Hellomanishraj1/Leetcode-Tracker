class Solution {
    public int minPathSum(int[][] grid) {
        int [][] dp=new int [grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans =helper(0,0,grid,dp);
        return ans ;
    }
    int helper(int r,int c,int [][] grid,int [][] dp){
        if (r >= grid.length || c >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if(r==grid.length-1 && c==grid[0].length-1){
            return grid[r][c];
        }
        if(dp[r][c]!=-1){
            return dp[r][c]; 
        }

        return dp[r][c]= grid[r][c]+ Math.min(helper(r+1,c,grid,dp),helper(r,c+1,grid,dp));
    }
}