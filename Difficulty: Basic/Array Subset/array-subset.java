
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
       Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;

        // Traverse both arrays using two pointers
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                // Element in a is smaller, move to the next element in a
                i++;
            } else if (a[i] == b[j]) {
                // Element found in both arrays, move to the next element in both arrays
                i++;
                j++;
            } else {
                // Element in b not found in a, not a subset
                return false;
            }
        }

        // If we have traversed all elements in b, it is a subset
        return j == b.length;
    }
}
