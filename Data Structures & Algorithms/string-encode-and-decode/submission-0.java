
/*
understabd:
decode= convert the input into a string and return 
encode: convert an array of strings into an array


edge cases:
""-> do we encode and decode or return empty array
what are the elements of input array type?-> any of the 256 valid characters
match:

plan:
how can I convert a array of strings into a string
what characters can I use as seperators

    encode:
        #)create a stringBuilder
"Hello World"
5#hello5#world
i=9  len=14
j=14


res=hello,world

*/
class Solution {
//make list to string
    public String encode(List<String> strs) {
       StringBuilder string = new StringBuilder();
       for(String element: strs){
       string.append(element.length()).append("#").append(element);
       
    }
    return string.toString();
        


    }
//make string to list
    public List<String> decode(String str) {
            List result = new ArrayList<>();
            int i=0;
            int j=0;
            int length;
            while(i<str.length()){
                  while(str.charAt(j)!='#'){//find the delimiter '#''
                    j++;
                  }
                length = Integer.parseInt(str.substring(i,j));//get the length and
                //turn it in number
                i=j+1;  //get a pointer variable after # so that it can point to the first character in word
                j=i+length; //get a pointer to the last character in the word
                result.add(str.substring(i,j)); //add to list
                i=j;//start with the next length of the next word

            }

            return result;


    }
}
