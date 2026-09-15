
/*
understand:

    question:
 
    edge cases:
       []->no k=0->no
       k>distinct element>no
       
    match:
        bucket sort/frequency map key=uniqueElement value=quantitiy of unique elements in array

    plan:
        #) create a hashmap freqMap 
        #) intiliaze an array buket +1 
        #) create a freqMap out of input array
        #)popularize bucketsort
        #)create the bucket sort number of unique elements as index of bucket array
        value of the index is key of freqMap
        #return k amount of elements
        bucket

        [0,1,2,3,4,5,6]


*/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];

        for(int i=0;i<nums.length;++i)//O(N)
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);   

        for(int i=0;i<bucket.length;++i){//#O(N)+1
            bucket[i]= new ArrayList<>();

        }   

        for(Map.Entry<Integer,Integer> m: freqMap.entrySet()){ //#O(M)
            bucket[m.getValue()].add(m.getKey());

        }      
        
        int[] result = new int[k];
        int index=0;
        for(int i=bucket.length-1;i>0;--i){//O(N)
            
            for(int n: bucket[i]){//O(J)
                 result[index++]=n;   
                if(index==k){
                    return result;
                }
            }


        }
        return result;




        
          
    }
}
