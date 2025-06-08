// User function Template for C#

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    public void RotateArr(int[] arr, int d) {
        // Code Here
        int n = arr.Length;
        d %=n;
        reverse(arr, 0, d-1);
        
        reverse(arr, d, n-1);
        
        reverse(arr, 0, n-1);
    }
    
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}