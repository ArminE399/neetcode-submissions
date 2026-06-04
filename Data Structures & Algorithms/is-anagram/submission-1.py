'''
UMPIRE:
    understand:
        input: strings
        output: boolean value
        constraint:
            no

        edge cases:
            empty input ""-> no
            lowercase->yes

            racecar carrrace-> false
            racecarr carrace
        match:
            frquency map/hashmap

        plan:

         1) len(s)!=len(t)
                return false

         2) freq={}   
         3) itherate through input s (for loop i)
                if i in freq:
                    freq[i]+=1
                freq[i]=1    
        4) itherate through input t:
            if i not in freq or freq[i]<=0:
                return False
    
            freq[i]-=1


                
            return max(freq.values())==0

    implement:

    review
    

    evulate 

'''

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:




        if len(s)!=len(t):
                return False

        freq={}   
        for i in s:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1    
        for i in t:
            if i not in freq or freq[i]<=0:
                return False
            freq[i]-=1


                
        return max(freq.values())==0

        