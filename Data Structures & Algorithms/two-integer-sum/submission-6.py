'''
UMPIRE:
    understand:
        input: an array
        output: indcies i,j
        constraint:   
         memory/space limits->no
         time complexity limits-> no
         max/min of input?
        
        edge cases:
            []->no
            -132, -7 ->yes
            elements>target
            
    match:   
        brute way force-> nested loops O(N^2)
        
        hashmap key=differences value=index

    plan:
        #) intiliaze an empty hashmap (map) 
        #) iterate through the loop (for loop, i,v)
            #) diff=v-target
            #) if v in map
                return [map[diff],i]
              map[diff]=i  
    implement:


    review:
    1)nums 3,4,5,6 target=7
    map=
    10,13,-17,12 target=-7

    map=
    val=10 diff=-17 index=0
    val=13 diff=-20 index=1
    val=-17 dif=10 ->pass

    2)nums 3,4,5,6 target=7
    map=
    10,13,-17,12 target=25

    map=
    val=10 diff=15 index=0
    val=13 diff=-20 index=1
    val=-17 dif=10 ->pass

   review:
   time complexity:
   O(N)
    space complexity:
    O(N)



'''

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map={}
        for i,v in enumerate(nums):
            diff=target-v                   
            if v in map:
                return [map[v],i]
            map[diff]=i
        return []                


        