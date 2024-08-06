//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String str) {
        int curr=0;
        int dot=0;
        for(char c:str.toCharArray())
        {
            if(c=='.')
            {
                if(curr>255)return false;
                curr=0;
                dot++;
            }
            else 
            {
                curr=curr*10+(c-'0');
            }
        }
        if(curr>255)return false;
        return true;
    }
}