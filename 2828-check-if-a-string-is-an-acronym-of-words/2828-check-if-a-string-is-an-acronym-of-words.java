class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String res="";
        for(int i=0;i<words.size();i++){
            String g=words.get(i);
            res+=g.charAt(0);
        }
        if(res.equals(s)){
            return true;
        }
        return false;
    }
}