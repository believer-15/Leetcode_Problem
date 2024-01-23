// class Solution {
//     public boolean isAcronym(List<String> words, String s) {
//         String res="";
//         for(int i=0;i<words.size();i++){
//             String g=words.get(i);
//             res+=g.charAt(0);
//         }
//         if(res.equals(s)){
//             return true;
//         }
//         return false;
//     }
// }

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (s.length() != words.size()) {
            return false;
        }
        int cnt = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) == s.charAt(i))
                cnt++;
        }
        if (cnt == s.length()) {
            return true;
        }

        return false;
    }
}