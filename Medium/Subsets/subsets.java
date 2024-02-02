//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    ArrayList<Integer> A = new ArrayList<Integer>();
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		        A.add(arr[i]);
		        
		    }
		   
		   
		    
		    ArrayList <ArrayList<Integer>> res = new Solution().subsets(A);
		    for (int i = 0; i < res.size (); i++)
		    {
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		          System.out.print(res.get(i).get(j)+" ");
		        }
		        System.out.println();
		      
		    }
		    //System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static ArrayList<ArrayList<Integer>> res;
    public static void sum(ArrayList<Integer> a,int n,ArrayList<Integer> curr)
    {
        if(n==-1)
        {
            
            res.add(curr);
            return ;
        }
        sum(a,n-1,curr);
        ArrayList<Integer> aa=new ArrayList<>();
        aa.add(a.get(n));
        aa.addAll(curr);
        
        sum(a,n-1,aa);
    }
    

    
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        res=new ArrayList<>();
        sum(A,A.size()-1,new ArrayList<Integer>());
        Collections.sort(res, new Comparator<ArrayList<Integer>>(){
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                int size = Math.min(o1.size(), o2.size());
                for (int i = 0; i < size; i++) {
                    int comp = o1.get(i) - o2.get(i);
                    if (comp != 0) {
                        return comp;
                    }
                }
                return o1.size() - o2.size();
            }
        });
        return res;
    }
}