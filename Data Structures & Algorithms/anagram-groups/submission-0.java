/*create a freqmap as a key for hashmap

*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
    

        for (String s: strs){
            int[] freqMap= new int[26];
            char[] character = s.toCharArray();
            for(char word: character)
                freqMap[word-'a']++;

            String key=Arrays.toString(freqMap);
            map.putIfAbsent(key,new ArrayList());
            map.get(key).add(s);


        } 
        return new ArrayList(map.values());



  
          
    }
}
