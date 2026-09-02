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