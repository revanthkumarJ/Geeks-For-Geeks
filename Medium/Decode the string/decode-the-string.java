//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        Stack<StringBuilder> st=new Stack<>();
        Stack<Integer> num=new Stack<>();
        StringBuilder r=new StringBuilder("");
        int n=0;
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
                n=n*10+(c-'0');
            else if(c=='[')
            {
                num.push(n);
                n=0;
                st.push(r);
                r=new StringBuilder();
            }
            else if(c==']')
            {
                StringBuilder temp=r;
                r=st.pop();
                int k=num.pop();
                while(k-->0)
                {
                    r.append(temp);
                }
            }
            else
                r.append(c);
        }
        return r.toString();
    }
}