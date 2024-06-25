//{ Driver Code Starts
// Initial Template for java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int k = Integer.parseInt(S[2]);
            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    mat[i][j] = Integer.parseInt(S1[j]);
                }
            }
            Solution ob = new Solution();
            int ans[][] = ob.rotateMatrix(k, mat);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


// User function template for java

class Solution {
    void rotate(int arr[],int k,int n)
    {
        int nn[]=new int[k];
        for(int i=0;i<k;i++)
        {
            nn[i]=arr[i];
        }
        
        int start=0,end=k;
        while(end<n)
        {
            arr[start++]=arr[end++];
        }
        for(int i=0;i<k;i++)
        {
            arr[start++]=nn[i];
        }
    }
    int[][] rotateMatrix(int k, int mat[][]) {
        int n=mat[0].length;
        k=k%n;
        for(int i[]:mat)
        {
            rotate(i,k,n);
        }
        return mat;
    }
}