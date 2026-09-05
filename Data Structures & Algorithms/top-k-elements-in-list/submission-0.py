'''
time complexity= O(m*n)
space=O(m*n)
'''
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq={}
        output=[]
        for i in nums:#O(N)
            if i not in freq:
                freq[i]=1
            freq[i]+=1

        for i in range(k): #O(M)
            max_key = max(freq, key=freq.get)#O(N)
            output.append(max_key)
            freq.pop(max_key)
        return output    

