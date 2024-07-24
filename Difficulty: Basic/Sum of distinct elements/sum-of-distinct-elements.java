//{ Driver Code Starts
//Initial Template for Java





import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findSum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




//User function Template for Java


class Solution {
    int findSum(int arr[], int n) {
        // code here
       int s=0;boolean isDistinct=true;
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]==arr[j]){
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct==true){
                s += arr[i];
            }
            isDistinct=true;
        }
        return s;
    }
   
}