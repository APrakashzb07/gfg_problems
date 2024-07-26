//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String str = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine().trim());
            Solution obj = new Solution();
            if (obj.kPangram(str, k))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    boolean kPangram(String str, int k) {
        // code here
        boolean[] present = new boolean[26];
        int uniqueCount = 0;
        
        for (char c: str.toCharArray()){
            if(c != ' '){
                int index = c-'a';
                if(!present[index]){
                    present[index] = true;
                    uniqueCount++;
                }
            }
        }
        int missingChars = 26-uniqueCount;
        return missingChars <= k && str.replace(" ","").length() >= 26;
    }
}