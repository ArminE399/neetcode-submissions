'''
UMPIRE:
    understand:
        input: an array, int
        output: array
        constraint:
            no
        edge cases:
        123
        -123-->yes
    match:
            
    plan:
        1)

'''

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        length=len(nums)
        k=0
        for i in range(length):
            for k in range(i+1,length):
               if nums[i]+nums[k]==target:
                return [i,k]   