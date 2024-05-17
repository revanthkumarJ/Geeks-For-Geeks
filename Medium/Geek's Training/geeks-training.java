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
            int [][]points=new int[N][3];
            for(int i=0;i<N;i++){
                for(int j=0;j<3;j++){
                    points[i][j]=sc.nextInt();
                }
            }
            Solution obj=new Solution();
            int res=obj.maximumPoints(points,N);
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int dp[][];
    
    
    public int call(int points[][],int ind,int last)
    {
        
        if(dp[ind][last]!=-1)return dp[ind][last];
        
        if(ind==0)
        {
            int max=0;
            for(int i=0;i<3;i++)
            {
                if(i!=last)
                {
                    max=Math.max(max,points[0][i]);
                }
            }
            dp[ind][last]=max;
            return max;
        }
        
        int max=0;
        for(int i=0;i<3;i++)
        {
            if(i!=last)
            {
                max=Math.max(call(points,ind-1,i)+points[ind][i],max);
            }
        }
        dp[ind][last]=max;
        return max;
    }
    public int maximumPoints(int points[][],int N){
        dp=new int[N][4];
        for(int arr[]:dp)
        {
            Arrays.fill(arr,-1);
        }
        return call(points,N-1,3);
    }
}