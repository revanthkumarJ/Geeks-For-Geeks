//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int coins[], int N, int sum) {
        long array[][]=new long[sum+1][N+1];
        for(int i=0;i<=N;i++)
        {
            array[0][i]=1;
        }
        for(int i=1;i<=sum;i++)
        {
            array[i][0]=0;
        }
        for(int i=1;i<=sum;i++)
        {
            for(int j=1;j<=N;j++)
            {
                long res=array[i][j-1];
                if(coins[j-1]<=i)
                {
                    res=res+array[i-coins[j-1]][j];
                }
                array[i][j]=res;
            }
        }
        return array[sum][N];
        
    }
}