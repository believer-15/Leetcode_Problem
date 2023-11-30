class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;;

        while(r < n){
            sum += nums[r];
            r++;

            if(r-l == k){
                max = Math.max(max, sum);
                sum -= nums[l];
                l++;
            }
        }
        if (n < k) {
            max = Math.max(max, sum);
        }
        return (double)max / k;
    }
}