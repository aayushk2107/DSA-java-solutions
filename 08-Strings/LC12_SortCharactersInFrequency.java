class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }
            else{
                map.put(ch,map.getOrDefault(ch , 0) + 1);
            }
        }
        String ans = "";
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 0; i < 62; i++){
            char ch = '0';
            if(i <= 9){
                ch = (char)(i + '0');
            }
            else if(i >= 10 && i <= 35){
                ch = (char)('A' + (i - 10));
            }
            else{
                ch = (char)('a' + (i - 36));
            }
            if(map.containsKey(ch)){
                num.add(map.get(ch));
            }
        }
        Collections.sort(num);
        for(int i = num.size() - 1;i >= 0; i--){
            int frequency = num.get(i);
            List<Character> a1 = new ArrayList<>();
            for(char ch: map.keySet()){
                if(map.get(ch).equals(frequency)){   // <-- FIXED LINE
                    a1.add(ch);
                }
            }
            Collections.sort(a1);
            for(int j = 0;j < a1.size();j++){
                for(int k = 0;k < frequency;k++){
                    ans += a1.get(j);
                }
            }
            while(i >= 0 && num.get(i) == frequency){
                i--;
            }
            i++;
        }
        return ans;
    }
}