
/* encode -> a string
    decode-> an array
*/


class Solution {

    public String encode(List<String> strs) {
            StringBuilder string = new StringBuilder();
               
               for(String element : strs)
                string.append(element.length()).append("#").append(element);
            return string.toString();
        //why not append(length#element)  why chain methods
    }
//example 3#hey2#my
    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int j=0;
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)=='#'){
            int number=Integer.parseInt(str.substring(j,i));
            j=i+number+1;
            i+=1;
            output.add(str.substring(i,j));
            i=j;  
            }
    
        }
        return output;

    }
}
