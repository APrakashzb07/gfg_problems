class Solution {
    public int GetSecondLargest(int[] arr) {
        // code here
        int n = arr.Length;

        int largest = -1, secondLargest = -1;

        // Finding the largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        // Finding the second largest element
        for (int i = 0; i < n; i++) {
            
            // Update second largest if the current element is greater
            // than second largest and not equal to the largest
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}