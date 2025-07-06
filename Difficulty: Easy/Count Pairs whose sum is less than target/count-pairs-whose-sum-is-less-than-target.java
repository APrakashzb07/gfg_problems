// User function Template for Java
class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int left = 0, right = arr.length-1;
        int counter = 0;
        
        while(left < right){
            int sum = arr[left] + arr[right];
            
            if(sum<target){
                counter += right-left;
                left++;
            }else{
                right--;
            }
        }
        return counter;
    }
}