//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        if(n<0)
        return 0;
        if(n==0)
        return 1;
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        int array[]=new int[n+1];
        array[0]=0;
        array[1]=1;
        array[2]=2;
        for(int i=3;i<=n;i++)
        {
            array[i]=(array[i-1]+array[i-2])%1000000007;
        }
        return array[n];
    }
}

