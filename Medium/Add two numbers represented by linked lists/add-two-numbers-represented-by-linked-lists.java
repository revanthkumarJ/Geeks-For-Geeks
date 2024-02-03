//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse(Node head)
    {
        Node pre=null;
        Node curr=head;
        while(curr!=null)
        {
            Node post=curr.next;
            curr.next=pre;
            pre=curr;
            curr=post;
        }
        return pre;
    }
    static Node addTwoLists(Node first, Node second){
        first=reverse(first);
        second=reverse(second);
        int c=0;
        c=first.data+second.data;
        Node head=new Node(c%10);
        c=c/10;
        first=first.next;
        second=second.next;
        Node temp=head;
        while(first!=null && second!=null)
        {
            c=c+first.data+second.data;
            Node n=new Node(c%10);
            c=c/10;
            first=first.next;
            second=second.next;
            temp.next=n;
            temp=n;
        }
        while(first!=null)
        {
            c=c+first.data;
            Node n=new Node(c%10);
            c=c/10;
            first=first.next;
            temp.next=n;
            temp=n;
        }
        while(second!=null)
        {
            c=c+second.data;
            Node n=new Node(c%10);
            c=c/10;
            second=second.next;
            temp.next=n;
            temp=n;
        }
        if(c==0)
        temp.next=null;
        else
        {
            Node n=new Node(c);
            temp.next=n;
            n.next=null;
        }
        
        return reverse(head);
    }
}