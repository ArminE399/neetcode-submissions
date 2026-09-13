/*1,1,1,2,2,3 k=2

count:
1:3
2:2
3:1
freq:
0 1 2 3 4 5 6 
  3 2 1    
*/


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //intiliaze an hashmap
        Map<Integer,Integer > freqMap = new HashMap<>();
        //intiliaze an array repersenting bucket sort
        List<Integer>[] count = new List[nums.length+1];
        
        //populate array wit empty arraylists because amount of input array elements can be tied we can have three-2's and three 1's
        for(int i=0;i<count.length;++i){
                count[i] = new ArrayList();
        }        
        
        //create frequency map
        for(int n: nums)
            freqMap.put(n,freqMap.getOrDefault(n,0)+1);
         
        //create the bucket sort value of freqmap as index of count array and key of freqmap as value inside of count array

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
                count[entry.getValue()].add(entry.getKey());
                
        }
        //pull k amount of answer from array
        int[] result=new int[k]; //we have to return a array
       int index=0;
        for(int i=count.length-1;i>0;--i){
            for(int n:count[i]){
                result[index++]=n;
                if(index==k)
                return result;
            }
        }
        return result;
    } 
}
