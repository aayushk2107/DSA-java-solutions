class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)==true){
                if(left<=map.get(ch)){
                   left=map.get(ch)+1;
                }
                map.put(ch,right);
            }
            else{
                map.put(ch,right);
            }
            int length=right-left+1;
            if(maxLength<length){
                maxLength=length;
            }
        }
        return maxLength;
    }
}