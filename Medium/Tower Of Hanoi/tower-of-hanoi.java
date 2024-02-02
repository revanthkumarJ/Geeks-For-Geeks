//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}






// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {

    long count;
    public void tower(int N,int A,int B,int C)
    {
        if(N==1)
        {
            System.out.println("move disk "+N+" from rod "+A+" to rod "+C);
            count++;
            return ;
        }
        tower(N-1,A,C,B);
        System.out.println("move disk "+N+" from rod "+A+" to rod "+C);
        count++;
        tower(N-1,B,A,C);
        
    }
    public long toh(int N, int from, int to, int aux) {
        count=0;
        tower(N,from,aux,to);
        return count;
    }
}
