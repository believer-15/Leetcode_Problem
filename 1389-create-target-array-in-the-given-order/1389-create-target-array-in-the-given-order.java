class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] ans = new int[nums.length];
        for(int i = 0; i < n; i++){
            list.add(index[i], nums[i]);
        }
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}