//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int[][] a = new int[n][n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
   public static boolean isPalindrome(String data){
        String rev="";
        for(int i=0;i<data.length();i++){
            rev=data.charAt(i)+rev;
        }
        if(rev.equals(data))
            return true;
        return false;
    }
    
    public String pattern(int[][] arr) {
        // Code here
        String element="";
        //First check for rows contains palindrome
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                //Get each row as a string in every iteration 
                element+=Integer.toString(arr[i][j]);
                
            }
            //Pass the String to the isPalindrome method
            if(isPalindrome(element))
                //Returning row number + R 
                return Integer.toString(i)+" R";
            element="";
        }
        //Check for columns
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                //Get each column as a string in every iteration
                element+=Integer.toString(arr[j][i]);
            }
            //Pass the String to the isPalindrome method
            if(isPalindrome(element))
                //Returning column number + C
                return Integer.toString(i)+" C";
            element="";
        }
        return "-1";
    }
}
