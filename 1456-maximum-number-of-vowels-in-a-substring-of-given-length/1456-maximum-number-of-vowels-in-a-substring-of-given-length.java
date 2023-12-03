class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int count = 0;
        int max = Integer.MIN_VALUE;

        while(r < n){
            char ch =  s.charAt(r);
            if(isVowel(ch)){
                count++;
            }
            r++;
            if(r-l == k){
                max = Math.max(count, max);
                char firstchar = s.charAt(l);
                if(isVowel(firstchar)){
                    count--;
                }
                l++;
            }
        }
        return max;
    }
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
