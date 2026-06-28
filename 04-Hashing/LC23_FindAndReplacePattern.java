class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        HashMap<Character,Integer> map=new HashMap<>();
        int number=1;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,number);
                number++;
            }
        }
        ArrayList<String> a1=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer> map2=new HashMap<>();
            int number2=1;      
            if(words[i].length() != pattern.length()){
                break;
            }
            for(int j=0;j<words[i].length();j++){
                String str=words[i];
                int sizz=words[i].length();
                char ch=str.charAt(j);
                char ch2=pattern.charAt(j);
                if(!map2.containsKey(ch)){
                    map2.put(ch,number2);
                    number2++;
                }
                if(map.get(ch2) != map2.get(ch)){
                    break;
                }
                if(j==sizz-1){
                    if(map.get(ch2) == map2.get(ch)){
                        a1.add(words[i]);
                    }
                }
            }
        }
        return a1;
    }
}
