//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i:arr)
        {
            if(i>=0)
            pos.add(i);
            else
            neg.add(i);
        }
        int i=0,j=0,m=pos.size(),ind=0,n=neg.size();
        while(i<m && j<n)
        {
            arr.set(ind++,pos.get(i++));
            arr.set(ind++,neg.get(j++));
        }
        while(i<m)
        {
            arr.set(ind++,pos.get(i++));
        }
        while(j<n)
        {
            arr.set(ind++,neg.get(j++));
        }
    }
}