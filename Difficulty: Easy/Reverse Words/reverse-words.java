//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        StringTokenizer st=new StringTokenizer(str,".");
        String res="";
        while(st.hasMoreTokens())
        {
            if(res.length()>0)
            res="."+res;
            res=st.nextToken()+res;
        }
        return res;
    }
}