//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{

    int dp[][];
    public int find(int arr[],int i,int curr)
    {
        if(i==0)
        {
            if(curr==0) return 1;
            return 0;
        }
        if(curr<0)return 0;
        if(dp[i][curr]!=-1)return dp[i][curr];
            dp[i][curr]= (find(arr,i-1,curr)+find(arr,i-1,curr-arr[i-1])) %1000000007;
        return dp[i][curr];
        
    }
	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    dp=new int[n+1][sum+1];
	    for(int a[] :dp)
	    {
	        Arrays.fill(a,-1);
	    }
	    return find(arr,n,sum);
	   
	} 
}