
/*

edge cases:
k>unique elements


match:
freq map/ 
bucket sort-> size n
hashmap-> key=frequency of elements/value of freqMap value=arraylist frequencymap key
1-6 no 0
3->3
2->2
1->1

*/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          
    List<Integer>[] bucketSort = new List[nums.length+1];
    Map<Integer,Integer> freqMap = new HashMap<>();
  //  Map<Integer,ArrayList> sort = new HashMap<>();
    for(int number: nums )   {    
        freqMap.put(number,freqMap.getOrDefault(number,0)+1);
    } 
    for(int i=1;i<bucketSort.length;++i){
        bucketSort[i]= new ArrayList();
    }
    for(Map.Entry<Integer,Integer> entry: freqMap.entrySet() ){

        bucketSort[entry.getValue()].add(entry.getKey());
    }

    int[] result = new int[k];
    int count=0;
    for(int i=bucketSort.length-1;i>0;--i){
        for(int j: bucketSort[i]){
            result[count++]=j;
           if(count==k)
           return result; 
        }


    }
    return result;

    
    }
   // return new int[2];
}

