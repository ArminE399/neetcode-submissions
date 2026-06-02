'''
UMPIRE:
    understand:
        input: array
        output: t/f

      constraints:
        no
     edge cases:
     empty nums->return false

     1 2 4 5 4->True

   match:
    hashmap/hashset frequency map
    3:2  

    plan:
        1) dup=set()
        2) itherate through the nums array (for loop i)
            if i in dup:
                return True
            dup.add(i)
        return False         
        
        implement:
        
        review
        3,2,1,3       

 evlaution:
       O(N)
       O(N)-1 if true
       O(N) if false
'''
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        dup = set()
        for i in nums:
            if i in dup:
                return True
            dup.add(i)   
        return False
        