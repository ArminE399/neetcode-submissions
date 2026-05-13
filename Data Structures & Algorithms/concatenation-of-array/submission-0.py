'''
UMPIRE:
understand:
        input: an array
        output: concatanted array
        constraints: no
        questions:
       values-> numbers
        edge cases:
        empty nums->no
        1->1,1

     match:
        array

    plan:
        1) create ans
        2) it= number.length*2
        2) itherate until we reach it (for loop counting var=i,var=count)
            3.1) if count==it:
                     count=0
                ans[i]=nums[count] 
    implement:            
review:
1,2,3,4,5,6,7

ans[0]->1
ans[1]->2
ans[2]->3
ans[4]->4
ans[5]->5
ans[6]->6
ans[7]->1
evluation:
time complexity n*2
space complexity=n*2
'''


class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans=[]
        it=len(nums)*2
        midPoint=len(nums)
        count=0
        for i in range(it):
            if count==midPoint:
                count=0
            ans.append(nums[count])  
            count+=1      
        return ans

         