class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();

        int left=0;

        for(int right=0;right<s2.length();right++){
            char ch=s2.charAt(right);
            map2.put(ch,map2.getOrDefault(ch,0)+1);

            if(right-left+1>s1.length()){
                char remove=s2.charAt(left);

                map2.put(remove,map2.getOrDefault(remove,0)-1);
                
                if(map2.get(remove)==0){
                    map2.remove(remove);
                }

                left++;
            }
            if(map.equals(map2)){
                return true;
            }
        }
        return false;
    }
}