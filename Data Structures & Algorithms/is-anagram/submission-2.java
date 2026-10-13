class Solution {
    public boolean isAnagram(String s, String t) {
/*racecarr carracee z*/           
           if(s.length()!=t.length()) return false;

            Map<Character,Integer> freqMap = new HashMap<>();
              char[] count=s.toCharArray();  
            for(Character m:count ){
                freqMap.put(m,freqMap.getOrDefault(m,0)+1);
            }
            char[] other=t.toCharArray();
            for(Character i:other){
                if(!freqMap.containsKey(i)|| freqMap.get(i)<=0){
                        return false;
                }
                freqMap.put(i,freqMap.get(i)-1);
            }
            
           
            List<Integer> l = new ArrayList<>(freqMap.values());
            
            for(int i=0;i<l.size();++i){
                    if(l.get(i)!=0) return false;
            }
         return true;

    }
}
