//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.recamanSequence(n);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    static ArrayList<Integer> recamanSequence(int n){
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> du=new HashSet<>();
        if(n==0)
        return res;
        int start=0;
        res.add(start);
        du.add(start);
        for(int i=2;i<=n;i++)
        {
            int r=start-i+1;
            if(r>0 && !du.contains(r))
            start=r;
            else
            start=start+i-1;
            res.add(start);
            du.add(start);
        }
        return res;
    }
}