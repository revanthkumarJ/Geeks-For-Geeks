//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long sequence(int N){
        long ind=1;
        long ans=0;
        for(int i=1;i<=N;i++)
        {
            long res=1;
            for(int j=1;j<=i;j++)
            {
                res=(res*ind)%1000000007;
                ind++;
            }
            ans=(ans+res)%1000000007;
        }
        return ans;
    }
}