//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{
    long ExtractNumber(String S){
        long max=-1;
        String num="";
        for(int i=0;i<S.length();i++)
        {
            char c=S.charAt(i);
            if(c>='0' && c<='9')
            num=num+c;
            else
            {
                if(num.length()>0)
                {
                    if(!num.contains("9"))
                    {
                        long n=Long.parseLong(num);
                        if(max<n)
                        max=n;
                    }
                    num="";
                }
            }
        }
        if(num.length()>0)
                {
                    if(!num.contains("9"))
                    {
                        long n=Long.parseLong(num);
                        if(max<n)
                        max=n;
                    }
                }
        return max;
    }
}