class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int val : arr){
            if(!hm.containsKey(val)){
                hm.put(val, 1);
            } else {
                hm.put(val, hm.get(val) + 1);
            }
        }
        HashSet<Integer> hs = new HashSet<>(hm.values());
        int n = hm.size();
        int m = hs.size();
        if(n == m){
            return true;    
        }else {
            return false;
        }
    }
}