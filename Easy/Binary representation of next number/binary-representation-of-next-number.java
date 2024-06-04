//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.binaryNextNumber(s));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String binaryNextNumber(String s) {
        char array[]=s.toCharArray();
        int i=s.length()-1;
        while(i>=0)
        {
            if(s.charAt(i)=='0')
            {
                array[i]='1';
                break;
            }
            else
            array[i]='0';
            i--;
        }
        if(i==-1)
        {
            
            return 1+(new String(array));
        }
    
        s=new String(array);
        i=0;
        while(s.charAt(i)=='0')
        {
            i++;
        }
        return s.substring(i);
        
    }
}