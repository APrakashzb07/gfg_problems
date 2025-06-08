
class Solution {
    public List<int> leaders(int[] arr) {
        // code here
        List<int> result = new List<int>();
        int n = arr.Length;
        
        int maxRight = arr[n-1];
        
        result.Add(maxRight);
        
        for(int i = n-2; i>= 0; i--){
            if(arr[i] >= maxRight){
                maxRight = arr[i];
                result.Add(maxRight);
            }
        }
        result.Reverse();
        return result;
    }
}
