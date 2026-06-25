
#3,4,5,6

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
            h={}
            for index,i in enumerate(nums):
                diff=target-i
                if diff in h:
                    return [h[diff],index]
                h[i]=index       
            return []





       
