

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