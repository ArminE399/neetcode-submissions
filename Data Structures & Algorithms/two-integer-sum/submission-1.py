'''
    understand:
        input: array and an integer
        output: array

        edge cases:
        -123->yes
        can target be smaller than any element in nums->
        constraints:
        no

    match:
        brtute force way O(N^2)
        hahsmap key=:value
                value=index key=difference between target and index value 
    plan:
        1) intiliaze a hashmap (d)
        2)  iterate through the nums array index,number(enumerate(nums))
                2.1) values[abs(target-number)]=index

        3) itherate through hashmap (counter i):
             value=abs(target-i)
             
             if d.get(value)+i==target:
                return [d[value],i]       



eavluate:
3,4,5,6

7,4,5,6


review:
O(N^2)
'''


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        outerlen=len(nums)-1
        nestedlen=len(nums)
        for i in range(outerlen):
            for j in range(i+1,nestedlen):
                if nums[i]+nums[j]==target:
                    return [i,j]
