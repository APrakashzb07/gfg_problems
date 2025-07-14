class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
}