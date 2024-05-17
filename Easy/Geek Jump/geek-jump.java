//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int N){
        if(N==1)
        return 0;
        int res[]=new int[N];
        res[0]=0;
        res[1]=Math.abs(arr[0]-arr[1]);
        for(int i=2;i<N;i++)
        {
            res[i]=Math.min((res[i-1]+Math.abs(arr[i]-arr[i-1])),(res[i-2]+Math.abs(arr[i]-arr[i-2])));
        }
        return res[N-1];
    }
}