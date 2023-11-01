class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int[] answer = new int[nums.length];

        // if(nums.length == 1){

        // }

        for(int i = 1; i < nums.length; i++){
            leftsum[i] = leftsum[i-1]+ nums[i-1];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            rightsum[i]= rightsum[i+1] + nums[i+1];
        }

        for(int i = 0; i< nums.length; i++){
            if(leftsum[i] > rightsum[i]){
                answer[i] = leftsum[i] - rightsum[i];
            }
            else{
                answer[i] = rightsum[i] - leftsum[i];
            }
        }
        return answer;
    }
}