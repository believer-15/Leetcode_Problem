class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] res = new int[n];

        int bait =  1;

        for(int i = 0; i < n; i++){
            res[i] = bait;
            bait *= nums[i];
        }

        bait = 1;
        for(int i = n-1; i >= 0; i--){
            res[i] *= bait;
            bait *= nums[i];
        }
        return res;
    }
}