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
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        List<Integer> array=new ArrayList<>();
        if(N/2000>0)
        {
            int t=N/2000;
            for(int i=1;i<=t;i++)
            {
                array.add(2000);
            }
            N=N%2000;
        }
        if(N/500>0)
        {
            int t=N/500;
            for(int i=1;i<=t;i++)
            {
                array.add(500);
            }
            N=N%500;
        }
        if(N/200>0)
        {
            int t=N/200;
            for(int i=1;i<=t;i++)
            {
                array.add(200);
            }
            N=N%200;
        }
        if(N/100>0)
        {
            int t=N/100;
            for(int i=1;i<=t;i++)
            {
                array.add(100);
            }
            N=N%100;
        }
        if(N/50>0)
        {
            int t=N/50;
            for(int i=1;i<=t;i++)
            {
                array.add(50);
            }
            N=N%50;
        }
        if(N/20>0)
        {
            int t=N/20;
            for(int i=1;i<=t;i++)
            {
                array.add(20);
            }
            N=N%20;
        }
        if(N/10>0)
        {
            int t=N/10;
            for(int i=1;i<=t;i++)
            {
                array.add(10);
            }
            N=N%10;
        }
        if(N/5>0)
        {
            int t=N/5;
            for(int i=1;i<=t;i++)
            {
                array.add(5);
            }
            N=N%5;
        }
        if(N/2>0)
        {
            int t=N/2;
            for(int i=1;i<=t;i++)
            {
                array.add(2);
            }
            N=N%2;
        }
        if(N/1>0)
        {
            int t=N/1;
            for(int i=1;i<=t;i++)
            {
                array.add(1);
            }
            N=N%1;
        }
        return array;
        
    }
}