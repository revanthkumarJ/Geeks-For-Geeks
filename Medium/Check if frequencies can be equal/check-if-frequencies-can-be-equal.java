//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        int array[]=new int[26];
        for(char c:s.toCharArray())
        {
            array[c-'a']++;
        }
        boolean isChanged=false;
        int prev=-1;
        for(int i=0;i<26;i++)
        {
            if(array[i]==0)
            continue;
            if(prev==-1)
            prev=array[i];
            else if(prev!=array[i])
            {
                if(isChanged)
                return false;
                else
                {
                    if(prev+1==array[i])
                    {
                        isChanged=true;
                    }
                    else if(array[i]+1==prev)
                    {
                        isChanged=true;
                        prev--;
                    }
                    else
                    return false;
                }
            }
        }
        return true;
    }
}