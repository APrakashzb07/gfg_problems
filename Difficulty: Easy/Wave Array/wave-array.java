class Solution {
    public static void convertToWave(int[] arr) {
        // code here
        
        int n = arr.length;

        // Swap adjacent elements to create wave pattern
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    

    }
}
