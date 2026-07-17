class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        int left=0;
        int start=0;
        int matched=0;
        int minLength=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                map2.put(ch,map2.getOrDefault(ch,0)+1);
                if(map2.get(ch).equals(map.get(ch))){
                    matched++;
                }
            }
            int length=right-left+1;
            while(matched==map.size()){
                char access=s.charAt(left);
                if(minLength>length){
                    minLength=length;
                    start=left;
                }
                if(map2.containsKey(access)){
                    map2.put(access,map2.get(access)-1);
                    if(map2.get(access)<map.get(access)){
                        matched--;
                    }       
                }
                length--;
                left++;
            }
        }
        if(minLength==Integer.MAX_VALUE){
            return "";
        }
        else{
            return s.substring(start,start+minLength);
            }
    }
}