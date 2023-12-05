class Solution {
    public int largestAltitude(int[] gain) {
        int currAlt = 0;
        int highPoint = currAlt;
        for(int altGain : gain){
            currAlt += altGain;
            highPoint = Math.max(highPoint, currAlt);
        }
        return highPoint;
    }
}