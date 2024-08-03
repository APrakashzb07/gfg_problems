//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        int minLength = arr[0].length();
        
        for (int i = 1; i < arr.length; i++) {
            minLength = Math.min(minLength, arr[i].length());
            for (int j = 0; j < minLength; j++){
                if (arr[0].charAt(j) != arr[i].charAt(j)) {
                    if (j == 0) {
                        return "-1";
                    }
                    minLength = j;
                    break;
                }
            }
        }
        
        return arr[0].substring(0, minLength);
    }
}