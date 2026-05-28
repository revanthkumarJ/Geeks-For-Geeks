/* Structure of binary tree node
class Node{
public:
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> verticalSum(Node root) {
        int min=0,max=0;

        
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<Node> queue= new LinkedList<>();
        Queue<Integer> valqueue = new LinkedList<>();
        
        queue.add(root);
        valqueue.add(0);
        while(queue.size()!=0){
            int size= queue.size();
            
            for(int i=1;i<=size;i++){
                Node curr= queue.poll();
                int currVal = valqueue.poll();
                int sum = map.getOrDefault(currVal,0)+curr.data;
                
                map.put(currVal,sum);
                if(currVal>max)
                max=currVal;
                
                if(min>currVal)
                min = currVal;
                
                if(curr.left!=null){
                    queue.add(curr.left);
                    valqueue.add(currVal-1);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                    valqueue.add(currVal+1);
                }
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while(min<=max){
            if(map.containsKey(min))
            result.add(map.get(min));
            min++;
        }
        
        return result;
    }
}