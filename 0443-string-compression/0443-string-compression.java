class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int j = 0;

        StringBuilder res = new StringBuilder();

        while (j < n) {
            int track = 1;
            while (j < n - 1 && chars[j] == chars[j + 1]) {
                track++;
                j++;
            }
            res.append(chars[i]);

            if (track > 1) {
                res.append(track);
            }

            i = j + 1;
            j = j + 1;
        }

        // Convert the compressed string back to a char array
        char[] resultChars = res.toString().toCharArray();
        System.arraycopy(resultChars, 0, chars, 0, resultChars.length);

        return resultChars.length;
    }
}
