class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp=new int [m][n];
        int ans =find(0,0,m,n,dp);
        return ans ;
    }
    int find(int r,int c,int m,int n,int [][] dp){
        if(r==m-1 && c==n-1){
            return 1;
        }
        if(r>=m || c>=n){
            return 0;
        }
        if(dp[r][c]!=0){
            return dp[r][c];
        }
        return dp[r][c]=find(r+1,c,m,n,dp)+find(r,c+1,m,n,dp);
    }
}