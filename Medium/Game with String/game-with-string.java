//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minValue(String s, int k){
        
        HashMap<Character,Integer> array=new HashMap<>();
        for(char c:s.toCharArray())
        {
            array.put(c,array.getOrDefault(c,0)+1);
        }
        int max=Integer.MAX_VALUE;
        PriorityQueue<Integer> arr=new PriorityQueue<>();
        for(int i:array.values())
        {
            arr.add(max-i);
        }
        while(k>0)
        {
            int ele=arr.poll();
            arr.add(ele+1);
            k--;
        }
        int sum=0;
        while(arr.size()>0)
        {
            
            int ele=max-arr.poll();
            sum=sum+ele*ele;
        }
        return sum;
    }
}