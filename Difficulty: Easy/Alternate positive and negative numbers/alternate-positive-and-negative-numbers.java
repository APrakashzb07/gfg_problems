//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int s = arr.size();
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for(int i = 0; i<s; i++){
            if(arr.get(i) >= 0){
                list1.add(arr.get(i));
            }
            else{
                list2.add(arr.get(i));
            }
        }
        
        
        arr.clear();
        
        int s1 = list1.size();
        int s2 = list2.size();
        
        int x = 0, y = 0;
        
        while(x<s1 && y<s2){
            arr.add(list1.get(x));
            arr.add(list2.get(y));
            x++;
            y++;
        }
        while(x<s1){
            arr.add(list1.get(x));
            x++;
        }
         while(y<s2){
            arr.add(list2.get(y));
            y++;
        }
        
    }
}