class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length+1;
         long sum = 0;
         for(int i = 0; i<arr.length; i++){
             sum += arr[i];
         }
         
         long expectedSum = n*(n+1)/2;
         
         return (int)(expectedSum - sum);
    }
}