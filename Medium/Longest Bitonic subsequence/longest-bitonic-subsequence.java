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
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
        int n=nums.length;
        int inc[]=new int[n];
        int dec[]=new int[n];
        inc[0]=1;
        for(int i=1;i<n;i++)
        {
            inc[i]=1;
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    inc[i]=(int)(Math.max(inc[i],1+inc[j]));
                }
            }
        }
        dec[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            dec[i]=1;
            for(int j=i;j<n;j++)
            {
                if(nums[i]>nums[j])
                {
                    dec[i]=(int)(Math.max(dec[i],1+dec[j]));
                }
            }
        }
        
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(inc[i]+dec[i]>max)
            max=inc[i]+dec[i];
        }
        return max-1;
        
    }
}