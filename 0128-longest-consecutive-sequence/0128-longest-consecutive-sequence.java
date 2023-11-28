class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int num : nums){
            hs.add(num);
        }
        int maxStreak = 0;
        for(int num : nums){
            if(!hs.contains(num-1)){
                int currNum = num;
                int currStreak = 1;

                while(hs.contains(num+1)){
                    currStreak++;
                    num++;
                }
                maxStreak = Math.max(currStreak, maxStreak);
            }
        }
        return maxStreak;
        
    }
}