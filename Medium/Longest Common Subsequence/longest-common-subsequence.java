//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        int array[][]=new int[x+1][y+1];
        for(int i=0;i<x;i++)
        {
            array[i][0]=0;
        }
        for(int i=0;i<y;i++)
        {
            array[0][i]=0;
        }
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    array[i][j]=1+array[i-1][j-1];
                }
                else
                {
                    array[i][j]=(int)Math.max(array[i-1][j],array[i][j-1]);
                }
            }
        }
        return array[x][y];
    }
    
}