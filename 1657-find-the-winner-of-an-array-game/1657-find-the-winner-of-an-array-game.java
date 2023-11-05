class Solution {
    public int getWinner(int[] arr, int k) {
        int maxElement = arr[0];

        for(int i = 1; i < arr.length; i++){
            maxElement = Math.max(maxElement, arr[i]);
        }
        int curr = arr[0];
        int wincount = 0;

        for(int i = 1; i < arr.length; i++){
            int opponent = arr[i];

            if(curr > opponent) {
                wincount++;
            } else{
                curr = opponent;
                wincount = 1;
            }
            if(wincount == k || curr == maxElement){
                return curr;
            }
        }
        return -1;
    }
}