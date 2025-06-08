// User function Template for C#

class Solution {
    // Complete this function
    public int closestNumber(int n, int m) {
        // Your code here
        int q = n/m;
        
        int n1 = m*q;
        
        int n2 = (n*m)>0?(m*(q+1)) : (m*(q-1));
        
        if(Math.Abs(n-n1)<Math.Abs(n-n2))
        {
            return n1;
        }else{
            return n2;
        }
    }
}