class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for(int i = 0; i<arr.length; i+=2){
            res.add(arr[i]);
        }
        return res;
    }
}