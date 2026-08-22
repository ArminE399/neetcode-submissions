 /*
 UMPIRE
    understand:
        input/output:
        array of integers -> t/f
        
        
        questions/contraints:
            nums-> integers?
        

        edge cases:
            []->false
            one element->false

    match:
        hashmap
            key=integers value=frequency element appears in array
        hashset
        O(N) 

    plan:
        #) intiliaze an hashmap
        #) itherate through input array
            #) if element is an key in the hashmap return True
            #) else populate hashmap with element as key and value of 1
        #)return false                

 review
1,3,4,5
 evluate:
time complexity:O(N)
space :O(N)
 */

class Solution {
    public boolean hasDuplicate(int[] nums) {
    Map<Integer,Integer> freqMap = new HashMap<>();
    
    for(int number: nums){
        if(freqMap.containsKey(number)) return true;
        
        else freqMap.put(number,1);
    }
    return false;

    }
}