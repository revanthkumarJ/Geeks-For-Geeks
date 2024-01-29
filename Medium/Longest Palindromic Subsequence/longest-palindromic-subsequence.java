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
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int lcs(int x, int y, String s1, String s2)
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
                if(s1.charAt(i-1)==s2.charAt(j-1))
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
    public int longestPalinSubseq(String S)
    {
        StringBuilder r=new StringBuilder(S);
        r.reverse();
        return lcs(S.length(),S.length(),S,r.toString());
    }
}