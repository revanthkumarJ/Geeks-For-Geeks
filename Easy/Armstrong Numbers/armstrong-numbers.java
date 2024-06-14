//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends




//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        
        int n1=n;
        double sum=0;
        while(n1>0)
        {
            sum+=Math.pow(n1%10,3);
            n1=n1/10;
        }
        
        if(n==sum) return "true";
        return "false";
    }
}