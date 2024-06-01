//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
        int freq[]=new int[26];
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        
       
        long sum=0;
        for(int i=0;i<26;)
        {
            if(freq[i]%2!=0)
                sum++;
            i++;
            if(i<26)
            {
                if(freq[i]!=0 && freq[i]%2==0)
                    sum++;
            }
            i++;
        }
        //System.out.println(sum);
        if(sum%2!=0) return "ODD";
        else return "EVEN";
    }
}
