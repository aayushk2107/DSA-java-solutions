class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> a1=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            if(right-left+1>p.length()){
                char remove=s.charAt(left);
                map2.put(remove,map2.get(remove)-1);
                if(map2.get(remove)==0){
                    map2.remove(remove);
                }
                left++;
            }
            if(map.equals(map2)){
                a1.add(left);
            }
        }
        return a1;
    }
}