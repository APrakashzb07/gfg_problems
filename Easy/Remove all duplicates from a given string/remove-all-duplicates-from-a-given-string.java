//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        // Create a LinkedHashSet to maintain the order of characters
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        // Iterate through each character of the input string
        for (char ch : str.toCharArray()) {
            // Add the character to the set
            set.add(ch);
        }
        
        // Build the result string using StringBuilder
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }
        
        // Convert StringBuilder to String and return
        return result.toString();

    }
}

