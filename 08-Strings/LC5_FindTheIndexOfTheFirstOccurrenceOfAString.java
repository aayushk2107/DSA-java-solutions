Approach 1 
class Solution {
    public int strStr(String haystack, String needle) {
        int size1 = needle.length();
        int size2 = haystack.length();
        if(size1 > size2){
            return -1;
        }
        for(int right = 0;right <= size2 - size1; right++){
            if(haystack.substring(right,right+size1).equals(needle)){
                return right;
            }
        }
        return -1;
    }
}

Approach 2 
    class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        int left = 0;
        for(int right = 0;right < haystack.length();right++){
            int length = right - left + 1;
            if(length == needle.length()){
                int index2 = left;
                int index = 0;
                while(index < needle.length()){
                    if(needle.charAt(index) != haystack.charAt(index2)){
                        break;
                    }
                    index2++;
                    index++;
                }
                index2--;
                index--;
                if(index2 == right && haystack.charAt(index2) == needle.charAt(index)){
                    return left;
                }
                else{
                    left++;
                }
            }
        }
        return -1;
    }
}
