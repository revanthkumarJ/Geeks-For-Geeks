//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution
{
    int value(String s)
    {
        int sum=0;
        for(int i:s.toCharArray())
        {
            sum=sum+(int)i;
        }
        return sum;
    }
    ArrayList<Integer> search(String pat, String S)
    {
        ArrayList<Integer> array=new ArrayList<>();
        int p=value(pat);
        int start=value(S.substring(0,pat.length()));
        if(start==p && S.substring(0,pat.length()).equals(pat))
        array.add(1);
        int j=0;
        for(int i=pat.length();i<S.length();i++)
        {
            start=start+(int)S.charAt(i)-(int)S.charAt(j++);
            if(start==p && pat.equals(S.substring(j,i+1)))
            array.add(j+1);
        }
        
        return array;
        
    }
}