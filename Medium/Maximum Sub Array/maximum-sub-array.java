//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        int start=0,end=0,s=0;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                if(sum>max)
                {
                    start=s;
                    end=i-1;
                    max=sum;
                }
                if(sum==max && (i-1-s)>(end-start))
                {
                    start=s;
                    end=i-1;
                }
                sum=0;
                s=i+1;
                
            }
            else
            {
                sum=sum+a[i];
            }
        }
        if(sum>max)
        {
            start=s;
            end=n-1;
            max=sum;
        }
        if(sum==max && (n-1-s)>(end-start))
        {
            start=s;
            end=n-1;
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(;start<=end;start++)
        {
            res.add(a[start]);
        }
        return res;
    }
}