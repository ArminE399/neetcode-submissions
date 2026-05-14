
'''
UMPIRE:
    understand:
    inout: array
    output: true or false

    edge cases:
    always integer

    1,2,3-> false
    1,2,2,3-> true
    nums is none-> false

    constraints:no

    match:
        counting frequency, hashmap/hashset

    plan:
        1) intiliaze a hashmap(count)
        2)  iterate through nums (for loop counting var) 
            2.1)if i in count:
                    return True
                
                count[i]=1
       3) return False    

    implementation:

 review:   
 array=1,2,3,3
array is None
evaluate:
time complexity= O(N)
space: O(N)

'''




class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        count = {} # step 1
        for i in nums: #step2
            if i in count: #step2.1
                return True
            count[i]=0 #step #2.2    
        return False
    
        