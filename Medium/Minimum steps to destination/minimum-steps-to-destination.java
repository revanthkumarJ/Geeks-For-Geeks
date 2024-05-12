//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int d = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            System.out.println(ob.minSteps(d));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minSteps(int d) {
        int k = 1;
        int curr = 0;
        int sum = 0;
        while(true){
            sum+=k;
            curr++;
            if(d%2 == 0 && sum%2==0 && d<=sum) return curr;
            else if(d%2==1 && sum % 2==1 && d <= sum) return curr;
            k++;
        }
    }
}