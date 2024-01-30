//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int ceil(int a[],int l,int r,int target)
    {
        while(l<r)
        {
            int m=l+(r-l)/2;
            if(a[m]>=target)
            r=m;
            else
            l=m+1;
        }
        return r;
    }
    static int longestSubsequence(int n, int a[])
    {
        int array[]=new int[n];
        array[0]=a[0];
        int len=1;
        for(int i=1;i<n;i++)
        {
            if(array[len-1]<a[i])
            {
                array[len++]=a[i];
            }
            else
            {
                int ind=ceil(array,0,len-1,a[i]);
                array[ind]=a[i];
            }
        }
        return len;
    }
} 