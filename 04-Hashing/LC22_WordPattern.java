class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []words=s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        int number=1;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,number);
                number++;
            }
        }
        int number2=1;
        HashMap<String,Integer> map2=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(!map2.containsKey(word)){
                map2.put(word,number2);
                number2++;
            }
        }
        for(int i=0;i<words.length;i++){
            char ch=pattern.charAt(i);
            String ch2=words[i];
            if(map.get(ch) != map2.get(ch2)){
                return false;
            }
        }
        return true;
    }
}