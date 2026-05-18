class Solution {
    public int maxSum(int n) {
        if(n<=4) return n;
        int by2= n/2;
        int by3 = n/3;
        int by4 = n/4;
        return Math.max(n,Math.max((by2+by3+by4),(maxSum(by2)+maxSum(by3)+maxSum(by4))));
    }
}
