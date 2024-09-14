//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            obj.print_divisors(n);
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i*i<=n; i++){
            if(n%i == 0){
                list.add(i);
                if(i != n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        for(int list2 : list){
            System.out.print(list2+" ");
        }
    }
}
