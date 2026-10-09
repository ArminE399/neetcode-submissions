
/*
return ->nested list?

contraints:
no

edge cases:
lowercase abc->yes
""->""
does the order in which I return the anagrams matter?

match:
sort input elements-> nlogn
hashmap -> freqMap of each element in key output:arraylist
plan:
intiliaze an array of [26] key=hashmap value=arraylist

*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List> map= new HashMap<>();
       
        int i;
     
        for( i=0;i<strs.length;++i){
            char[] character= strs[i].toCharArray();
            int[] characterFreqMap = new int[26];

            for(char c:character){
                characterFreqMap[c-'a']+=1;      
            }
           String key=Arrays.toString(characterFreqMap);
         //I put characterFreqMap.toString() which returns the object in memory address which was a mistake
         
         // no need for the if else statement either putIfabsent() works
           if(map.containsKey(key))
            map.get(key).add(strs[i]);
            else{
            List<String> list = new ArrayList<>();
             list.add(strs[i]);
              map.put(key,list);
            }
        }

       return new ArrayList(map.values());
    }
}
