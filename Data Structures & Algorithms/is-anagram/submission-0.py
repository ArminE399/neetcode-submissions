'''
Umpire:
    understand:
        input: two strings
        output: true or false
        
        edge cases:
            both null->not gonna happen
            t=rr s=rr        
        constraints:
            no and no
    match:
        hashmaps, frequency map
    implement:
    
    review:
    s=racecar 
    t=carace  -> false


    plan:
        1) if len(s)!=len(t) return false
        2) countingFreq={}
        3) itherate through input s (for loop need a counter (i))
            3.1) if i in counter:
                    countingFreq[i]+=1
                else:
                    countingFreq[i]=1
        4) itherate through input t (for loop need a counting var i):
            4.1) if i in countingFreq or countingFreq[i]<0:
                    return False
                countingFreq[i]-=1
        
        return Max(countingFreq)==0    
                   

review:
s=racecar
r=2
a=2
c=2
e=1
t=carrace

evluate:
time complexity:
O(N)
space O(N)
'''

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:


        if len(s)!=len(t): 
            return False
        countingFreq={}
        for i in s:
            if i in countingFreq:
                countingFreq[i]+=1
            else:
                countingFreq[i]=1
        for i in t:
            if i not in countingFreq or countingFreq[i]<0:
                return False
            countingFreq[i]-=1
        
        return max(countingFreq.values())==0   
        