//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int M=sc.nextInt();
            
            int [][]grid=new int[N][M];
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    grid[i][j]=sc.nextInt();
                    
                }
            }
            
            Solution obj=new Solution();
            long res=obj.solve(N, M, grid);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int dp[][][];
    public int help(int grid[][],int m,int n,int i, int j1,int j2)
    {
        if(j1<0 || j1>=n || j2<0 || j2>=n)return -1000000;
        if(dp[i][j1][j2]!=-1)return dp[i][j1][j2];
        if(i==m-1)
        {
            if(j1==j2)
            {
                return Math.max(grid[i][j1],grid[i][j2]);
            }
            else
            {
                return grid[i][j1]+grid[i][j2];
            }
        }
        int a=Integer.MIN_VALUE;
        for(int j=-1;j<=1;j++)
        {
            for(int k=-1;k<=1;k++)
            {
                int r=help(grid,m,n,i+1,j1+j,j2+k);
                if(r>a)
                a=r;
            }
        }
        int mm=0;
        if(j1==j2)
        {
            mm=Math.max(grid[i][j1],grid[i][j2]);
        }
        else
        {
            mm=grid[i][j1]+grid[i][j2];
        }
        
        dp[i][j1][j2]= a+mm;
        return dp[i][j1][j2];
        
        
    }
    public int solve(int m, int n, int grid[][]){
        
     dp = new int[m][n][n];

    // Initialize the dp array with -1
    for (int row1[][] : dp) {
      for (int row2[] : row1) {
        Arrays.fill(row2, -1);
      }
    }
        
        return help(grid,m,n,0,0,n-1);
    }
}