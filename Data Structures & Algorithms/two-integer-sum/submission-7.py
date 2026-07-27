

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map={}
        for i,v in enumerate(nums):
            diff=target-v                   
            if v in map:
                return [map[v],i]
            map[diff]=i
        return []                


        