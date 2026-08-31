/*
umpire
understand:
    
    edge cases:
        []->no
        -numbers -> allowed
match:
nested for loop
arrays  nums[i]-target=nums[j]
key=diff of target and index
value=index of value 
7,6,3,4
0-0
1-1
4-2

*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;++i){
           int key=target-nums[i];
            
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]),i};
            }
           map.put(key,i);
        }  
               
    return new int[]{} ;
    }
}
