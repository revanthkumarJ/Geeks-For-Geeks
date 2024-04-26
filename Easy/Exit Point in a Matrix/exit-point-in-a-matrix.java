//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int[] ans = ob.FindExitPoint(n, m, matrix);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        boolean right=true,left=false,bottom=false,up=false;
        int px=-1,py=-1;
        int x=0,y=0;
        while(x<n && y<m && x>=0 && y>=0)
        {
            px=x;
            py=y;
            //System.out.println(x+" "+y);
            if(matrix[x][y]==0)
            {
                if(right)
                    y++;
                else if(left)
                    y--;
                else if(bottom)
                    x++;
                else
                    x--;
            }
            else
            {
                matrix[x][y]=0;
                if(right)
                {
                    right=false;
                    bottom=true;
                }
                else if(left)
                {
                    left=false;
                    up=true;
                }
                else if(up)
                {
                    up=false;
                    right=true;
                }
                else
                {
                    bottom=false;
                    left=true;
                }
            }
        }
        
        int arr[]=new int[2];
        arr[0]=px;
        arr[1]=py;
        return arr;
    }
}