//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minValue(String s, int k){
        // code here
         HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else{
                map.put(ch, 1);
            }
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(char ch : map.keySet()){
            al.add(map.get(ch));
        }
        
        // System.out.println(al);
        
        while(k > 0){
            Collections.sort(al);
            
            al.add(al.size() - 1, al.get(al.size() - 1) - 1);
            al.remove(al.size() -1);
            k--;
        }
        
        // System.out.println(al);
        int sum = 0;
        for(int ele : al){
            sum += (ele * ele);
        }
        
        return sum;
    }
}