//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            long topDownans = obj.topDown(n);
            long bottomUpans = obj.bottomUp(n);
            if (topDownans != bottomUpans)
                System.out.println(-1);
            else
                System.out.println(topDownans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    static HashMap<Integer,Long> map=new HashMap<>();
    static long topDown(int n) {
        if(n==0)
        return 0l;
        if(n==1)
        return 1l;
        if(map.containsKey(n))
        return map.get(n);
        long res=(topDown(n-1)+topDown(n-2))%1000000007;
        map.put(n,res);
        return res;
    }

    static long bottomUp(int n) {
        if(n==0)return 0;
        if(n==1) return 1;
        return topDown(n);
    }
}
