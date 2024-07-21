//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public boolean arraySortedOrNot(List<Integer> arr) {
        // code here
        if( arr.size() == 1){
                return true;
            }
            
        for(int i=0;i<arr.size()-1;i++){
            
            if(arr.get(i) <= arr.get(i+1)){
               continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

//{ Driver Code Starts.

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] numStrings = line.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String numString : numStrings) {
                nums.add(Integer.parseInt(numString));
            }
            Solution ob = new Solution();
            boolean ans = ob.arraySortedOrNot(nums);
            System.out.println(ans ? "true" : "false");
        }
        scanner.close();
    }
}
// } Driver Code Ends