//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int N = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i = 0 ; i < N; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            int P= Integer.parseInt(br.readLine().trim());
            //calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P); 
            
            //printing array elements
            for(int i = 0; i < N ; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}




// } Driver Code Ends


class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        
         HashMap<Integer, Integer> number = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            if(arr[i] <= P){
                if(number.containsKey(arr[i])){
                    number.put(arr[i], number.get(arr[i]) + 1);
                } else{
                    number.put(arr[i], 1);
                }
            }
        }
        // System.out.println(number);
        
       
        for(int i = 0; i < N; i++){
            int temp = i + 1;
            if(number.containsKey(temp)){
                arr[i] = number.get(temp);
            }
            else {
                arr[i] = 0;
            }
        }
        
        
        // for(int i = 0; i < N; i++){
        //     System.out.print(arr[i]);
        // }
        
        
    }
}
