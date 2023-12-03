class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int count = 0;
        int max = 0;

        // Handle the case where k is greater than the length of the string
        if (k >= n) {
            for (char ch : s.toCharArray()) {
                if (isVowel(ch)) {
                    count++;
                }
            }
            return count;
        }

        // Initial window setup
        for (r = 0; r < k; r++) {
            if (isVowel(s.charAt(r))) {
                count++;
            }
        }
        max = count;

        // Slide the window
        while (r < n) {
            if (isVowel(s.charAt(r - k))) {
                count--;
            }
            if (isVowel(s.charAt(r))) {
                count++;
            }
            max = Math.max(count, max);
            r++;
        }

        return max;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
