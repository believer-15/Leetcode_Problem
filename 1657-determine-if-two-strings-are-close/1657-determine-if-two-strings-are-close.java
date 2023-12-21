class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 =  new int[26];

        for(char ch : word1.toCharArray()){
            arr1[ch - 'a']++;
        }

        for(char ch : word2.toCharArray()){
            arr2[ch - 'a']++;
        }

        for(int i = 0; i<26; i++){
            if((arr1[i]== 0 && arr2[i]!= 0) || (arr1[i] != 0 && arr2[i] == 0)){
                return false;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i : arr1){
//             if(i>0){
//                 map.put(i,map.getOrDefault(i,0)+1);
//             }
//         }

//         for(int i : arr2){
//             if(i> 0){
//                 if(!map.containsKey(i)){
//                     return false;
//                 }

//                 map.put(i, map.get(i) -1);
//                 if(map.get(i) == 0){
//                     map.remove(i);
//                 }
//             }
//         }
//         return map.size() == 0;
    }
}