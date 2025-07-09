// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        if(s.length() == 0 || s.length() == 1)
        return s.length();
        
        int res = 0;
        boolean[] vis = new boolean[26];
        
        int left = 0, right = 0;
        while(right < s.length()){
            
        while(vis[s.charAt(right)-'a'] == true){
            vis[s.charAt(left)-'a'] = false;
            left++;
        }
        
        vis[s.charAt(right) - 'a'] = true;
        
        res = Math.max(res, (right-left+1));
        right++;
        }
        return res;
    }
}