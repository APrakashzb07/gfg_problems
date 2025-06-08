class Solution {
    public void ReverseArray(int[] arr) {
        // code here
        int n = arr.Length;
        int start = 0;
        int end = n-1;
        
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}