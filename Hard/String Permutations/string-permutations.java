//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    ArrayList<String>res;
    public void add(String S,int i)
    {
        if(i==S.length())
        {
            res.add(S);
            return;
        }
        for(int j=i;j<S.length();j++)
        {
            char [] array=S.toCharArray();
            char temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            add(new String(array),i+1);
        }
    }
    public ArrayList<String> permutation(String S)
    {
        res=new ArrayList<>();
        add(S,0);
        Collections.sort(res);
        return res;
    }
	   
}
