//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            long k = Long.parseLong(inputLine[1]);
            long[] arr = new long[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            long[] ans = new Solution().getDigitDiff1AndLessK(arr, n, k);
            for (long ele : ans) {
                System.out.print(ele + " ");
            }
            if (ans.length == 0) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java





class Solution {
    boolean isCorrect(long n)
    {
        long p=n%10;
        n=n/10;
        if(n==0)
        return false;
        while(n>0)
        {
            long c=n%10;
            if(Math.abs(c-p)!=1)
            return false;
            n=n/10;
            p=c;
        }
        return true;
    }
    long[] getDigitDiff1AndLessK(long[] arr, int n, long k) {
        ArrayList<Long> a=new ArrayList<>();
        for(long i:arr)
        {
            if(i<k && isCorrect(i))
            a.add(i);
        }
        long res[]=new long[a.size()];
        for(int i=0;i<a.size();i++)
        {
            res[i]=a.get(i);
        }
        return res;
    }
}
