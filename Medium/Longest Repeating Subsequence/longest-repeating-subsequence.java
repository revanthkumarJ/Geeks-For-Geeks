//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int lcs(int x, int y, String s1, String s2)
    {
        int array[][]=new int[x+1][y+1];
        for(int i=0;i<x;i++)
        {
            array[i][0]=0;
        }
        for(int i=0;i<y;i++)
        {
            array[0][i]=0;
        }
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1) && i!=j)
                {
                    array[i][j]=1+array[i-1][j-1];
                }
                else
                {
                    array[i][j]=(int)Math.max(array[i-1][j],array[i][j-1]);
                }
            }
        }
        return array[x][y];
    }
    public int LongestRepeatingSubsequence(String str)
    {
        return lcs(str.length(),str.length(),str,str);
    }
}