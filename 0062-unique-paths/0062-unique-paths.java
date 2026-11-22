class Solution {
    public int uniquePaths(int m, int n) {
        int [] [] dp=new int [m][n];
       
        int ans =helper(0,0,m,n,dp);
        return ans ;
    }
int helper(int r,int c,Integer m,Integer n,int [] [] dp){
    if(r>=m || c>=n){
        return 0;
    }
    if(r==m-1 && c==n-1){
        return 1;
    }
    if(dp[r][c]!=0){
        return dp[r][c];
    }
    int down=helper(r+1,c,m,n,dp);
    int right=helper(r,c+1,m,n,dp);
    return dp[r][c]= down+right;
}

}