class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        solve(nums,ans, index);
        return ans;
    }
    public static void solve(int[] nums, List<List<Integer>> ans, int index){
        if(index >= nums.length){
            ans.add(convertIntArrayToList(nums));
            return;
        }
        for(int j = index; j < nums.length; j++){
            int temp = nums[index];
            nums[index] = nums[j];
            nums[j] = temp;

            solve(nums, ans, index+1);

            temp = nums[index];
            nums[index] = nums[j];
            nums[j] = temp;
        }
    }
    private static List<Integer> convertIntArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }
}