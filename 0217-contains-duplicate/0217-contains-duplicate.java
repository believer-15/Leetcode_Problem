class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> arr = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!arr.containsKey(nums[i])){
                arr.put(nums[i], 1);
            } else {
                return true;
            }
        }
        return false;
    }
}