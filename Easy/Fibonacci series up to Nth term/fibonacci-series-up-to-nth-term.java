//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    int[] Series(int n) {
        // code here
         ArrayList<Integer> res = new ArrayList<>();
        int a = 0, b = 1, mod = (int)(1e9 + 7);
        
        res.add(a);
        res.add(b);
        
        for(int i = 2; i <= n; i++) {
            int c = (a + b) % mod;
            res.add(c);
            
            a = b;
            b = c;
        }
        
        int arr[] = new int[res.size()];
        for(int i = 0; i < res.size(); i++)
            arr[i] = res.get(i);
        
        return arr;
    }
}