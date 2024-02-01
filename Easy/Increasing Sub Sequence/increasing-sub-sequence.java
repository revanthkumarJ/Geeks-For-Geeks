//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
    static int maxLength(String S){
        int n=S.length();
        int array[]=new int[n];
        array[0]=1;
        for(int i=1;i<n;i++)
        {
            array[i]=1;
            for(int j=0;j<i;j++)
            {
                if(S.charAt(i)>S.charAt(j))
                {
                    array[i]=(int)Math.max(array[i],1+array[j]);
                }
            }
        }
        int max=0;
        for(int i:array)
        {
            if(i>max)
            max=i;
        }
        return max;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}


// } Driver Code Ends