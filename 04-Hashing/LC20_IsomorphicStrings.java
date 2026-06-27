class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        int number=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);        
            if(!map.containsKey(ch)) {
                map.put(ch, number);
                number++;
            }
        }
        int number2=1;
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map2.containsKey(ch)) {
                map2.put(ch, number2);
                number2++;
            }
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=t.charAt(i);
            if(map.get(ch)!=map2.get(ch2)){
                return false;
            }
        }
        return true;
    }
}