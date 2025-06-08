// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int repeating = -1;
        for(int i = 0; i<n; i++){
            int val = Math.abs(arr[i]);
            
            if(arr[val-1]>0){
                arr[val-1] = -arr[val-1];
            }else{
                repeating = val;
            }
        }
        int missing = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] > 0){
                missing = i+1;
                break;
            }
        }
         ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }
}
