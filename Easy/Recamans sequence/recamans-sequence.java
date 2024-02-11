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
        ArrayList<Integer> array=new ArrayList<>();
        HashSet<Integer> map=new HashSet<>();
        array.add(0);
        map.add(0);
        int ind=1;
        while(ind<=n)
        {
            int res=array.get(ind-1)-(ind);
            if(res>0 && !map.contains(res))
            array.add(res);
            else{
                res=array.get(ind-1)+(ind);
            array.add(res);
            }
            ind++;
            map.add(res);
        }
        return array;
    }
}