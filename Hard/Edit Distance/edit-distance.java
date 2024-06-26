//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int editDistance(String s, String t) {
        int m=s.length(),n=t.length();
        int array[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            array[i][0]=i;
        }
        for(int j=0;j<=n;j++)
        {
            array[0][j]=j;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                array[i][j]=array[i-1][j-1];
                else
                {
                    array[i][j]=1+(int)Math.min(Math.min(array[i-1][j],array[i][j-1]),array[i-1][j-1]);
                }
            }
        }
        return array[m][n];
    }
}