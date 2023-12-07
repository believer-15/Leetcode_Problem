class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
            
        }
        for(int i = 0; i < nums.length; i++){
            nums[(i+k)%nums.length] = list.get(i);
        }
    }
}