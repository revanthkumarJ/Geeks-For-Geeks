//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfConsecutiveOnes(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int numberOfConsecutiveOnes(int n) {
        long a=1,b=1;
        long ans=1;
        if(n==1 || n==2){
            return 1;
        }
        for(int i=3;i<=n;i++){
            long c=(a+b)%1000000007;
            a=b;
            b=c;
            
            ans=((ans*2)%1000000007 + a)%1000000007;
        }
        return (int)ans;
    }
}
