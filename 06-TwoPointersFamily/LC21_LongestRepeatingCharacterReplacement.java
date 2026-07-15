class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            int maxFreq=0;
            for(char ch1: map.keySet()){
                if(map.get(ch1)>maxFreq){
                    maxFreq=map.get(ch1);
                }
            }
            int windowSize=right-left+1;
            while(windowSize-maxFreq>k){
                char access=s.charAt(left);
                map.put(access,map.get(access)-1);
                left++;
                windowSize--;
                if(map.get(access)==0){
                    map.remove(access);
                }
            }
            if(windowSize>maxLength){
                maxLength=windowSize;
            }
        }
        return maxLength;
    }
}