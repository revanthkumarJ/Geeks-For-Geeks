//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String compareFrac(String s) {
        StringBuilder a=new StringBuilder("");
        int i=0;
        char ch=s.charAt(0);
        while(ch>='0' && ch<='9')
        {
            a.append(ch);
            i++;
            ch=s.charAt(i);
        }
        while(!(ch>='0' && ch<='9'))
        {
            i++;
            ch=s.charAt(i);
        }
        StringBuilder b=new StringBuilder("");
        ch=s.charAt(i);
        while(ch>='0' && ch<='9')
        {
            b.append(ch);
            i++;
            ch=s.charAt(i);
        }
        while(!(ch>='0' && ch<='9'))
        {
            i++;
            ch=s.charAt(i);
        }
        StringBuilder c=new StringBuilder("");
        ch=s.charAt(i);
        while(ch>='0' && ch<='9')
        {
            c.append(ch);
            i++;
            ch=s.charAt(i);
        }
        while(!(ch>='0' && ch<='9'))
        {
            i++;
            ch=s.charAt(i);
        }
        StringBuilder d=new StringBuilder("");
        ch=s.charAt(i);
        while(ch>='0' && ch<='9')
        {
            d.append(ch);
            i++;
            if(i<s.length())
            ch=s.charAt(i);
            else
            break;
        }
        
        
        double mm=(  Double.parseDouble(a.toString())/Double.parseDouble(b.toString())  );
        double nn= (  Double.parseDouble(c.toString())/Double.parseDouble(d.toString())  ) ;
        
        if(  mm >nn  )
        {
            return a.toString()+"/"+b.toString();
        }
        else if(mm<nn)
        {
            return c.toString()+"/"+d.toString();
        }
        return "equal";
        
    }
}
