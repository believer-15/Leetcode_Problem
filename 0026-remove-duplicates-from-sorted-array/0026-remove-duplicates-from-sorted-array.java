class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = Integer.MIN_VALUE;
        for(int num : nums){
            if(num != n){
                n = num;
                nums[i]= n;
                i++;
            }
        }
        return i;
    }     
} 