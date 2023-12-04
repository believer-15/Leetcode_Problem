class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int ans = 0;
        int window = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            window = window + nums[i];
            while(window + k < i-l+1){
                window = window - nums[l];
                l++;
            }
            ans = Math.max(ans, i-l+1);
        }
        return ans;
    }
}