//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int target = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.threeSumClosest(array,target));
            t--;
        }
    } 
} 

// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int threeSumClosest(int[] array, int target)  
	{ 
        Arrays.sort(array);
        int n=array.length;
        int min=array[0]+array[1]+array[2];
        for(int i=0;i<n-2;i++)
        {
            if(i!=0 && array[i]==array[i-1])continue;
            int left=i+1,right=n-1;
            while(left<right)
            {
                int r=array[i]+array[left]+array[right];
                if(Math.abs(target-min)>Math.abs(target-r))
                min=r;
                else if(r>min && Math.abs(target-min)==Math.abs(target-r))
                min=r;
                if(r>target)
                right--;
                else if(r<target)
                left++;
                else return target;
            }
        }
        return min;
	} 
} 
