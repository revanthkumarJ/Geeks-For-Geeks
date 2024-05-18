//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int dp[][];
    static boolean find(int arr[],int i,int curr)
    {
        if(curr==0)return true;
        if(i==0) return arr[0]==curr;
        if(curr<0) return false;
        if(dp[i][curr]!=-1)
        {
            return dp[i][curr]==1;
        }
        dp[i][curr] =(find(arr,i-1,curr-arr[i]) || find(arr,i-1,curr))? 1:0 ;
        return dp[i][curr]==1;
    }

    static Boolean isSubsetSum(int N, int arr[], int sum){
       dp=new int[N][sum+1];
       for(int a[]:dp)
       {
           Arrays.fill(a,-1);
       }
        return find(arr,N-1,sum);
        
    }
}