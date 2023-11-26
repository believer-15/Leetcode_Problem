class Solution {
    public String reverseWords(String s) {

        // String[] str = s.trim().split("\\s+");
        // int n = str.length-1;
        // String out = "";

        // for(int i = n; i > 0; i--) {
        //     out += str[i] + " ";
        // }
        // return out + str[0];

        int i = s.length() -1;
        int j = s.length() -1;

        StringBuilder sb = new StringBuilder();

        while(j >= 0){
            if(s.charAt(j) != ' '){
                j--;
            }else {
                if(j+1 <= i) sb.append(s.substring(j+1,i+1)).append(" ");
                j--;
                i = j;
            }
        }

        sb.append(s.substring(j+1, i+1));
        return sb.toString().trim();
    }
}