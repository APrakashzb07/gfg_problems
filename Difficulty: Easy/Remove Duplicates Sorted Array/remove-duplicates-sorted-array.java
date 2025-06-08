class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        int n = arr.length;
        if(n<=1){
            return n;
        }
        int idx = 1;
        
        for(int i =1; i<n; i++){
            if(arr[i] != arr[i-1]){
                arr[idx] = arr[i];
                idx++;
            }
        }
        return idx;
    }
}