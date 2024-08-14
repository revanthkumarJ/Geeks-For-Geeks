//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestCommonSubstr(String S1, String S2) {
        int max=0;
        int n=S1.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(S2.contains(S1.substring(i,j+1)))
                {
                    if((j-i+1)>max)
                    max=(j-i+1);
                }
            }
        }
        return max;
    }
}