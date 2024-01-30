//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading length of line segment
            int n = Integer.parseInt(read.readLine().trim());
            
            
            //reading 3 segment lengths
            String str[] = read.readLine().trim().split(" ");
            
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            
            
            //calling method maximizeCuts() of class Solution()
            //and printinting the result
            System.out.println(new Solution().maximizeCuts(n, x, y, z));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int a, int b, int c)
    {
       int array[]=new int[n+1];
       array[0]=0;
       for(int i=1;i<=n;i++)
       {
           array[i]=-1;
           if(i-a>=0)
           array[i]=(int)Math.max(array[i],array[i-a]);
           if(i-b>=0)
           array[i]=(int)Math.max(array[i],array[i-b]);
           if(i-c>=0)
           array[i]=(int)Math.max(array[i],array[i-c]);
           if(array[i]!=-1)
           array[i]++;
       }
       if(array[n]==-1)
       return 0;
       return array[n];
    }
}
