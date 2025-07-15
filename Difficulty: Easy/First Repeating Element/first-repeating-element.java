class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashSet<Integer> res = new HashSet<>();
        
        int minVal = Integer.MAX_VALUE;
        for(int i = arr.length-1; i>=0; i--){
            if(res.contains(arr[i])){
                minVal = Math.min(minVal, i);
            }
            res.add(arr[i]);
        }
        
        return minVal == Integer.MAX_VALUE ? -1 : minVal+1;
    }
}
