//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Solution ob = new Solution();
            int ans = ob.remove_duplicate(arr);
            for (int i = 0; i < ans; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to remove duplicates from the given array
    public int remove_duplicate(List<Integer> arr) {
        // Code Here
        if (arr == null || arr.size() == 0) {
            return 0;
        }

        int res = 1;
        for (int i = 1; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get(res - 1))) {
                arr.set(res, arr.get(i));
                res++;
            }
        }
        return res;
        
    }
}
