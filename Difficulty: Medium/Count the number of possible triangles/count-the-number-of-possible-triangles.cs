// User function Template for C#

class Solution {
    // Function to count the number of possible triangles.
    public int countTriangles(int[] arr) {
        // code here
        int res = 0;
        Array.Sort(arr);
        
        for(int i = 2; i<arr.Length; i++){
            int left = 0;
            int right = i-1;
            
            while(left<right){
                if(arr[left] + arr[right] > arr[i]){
                    res += right-left;
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }
}