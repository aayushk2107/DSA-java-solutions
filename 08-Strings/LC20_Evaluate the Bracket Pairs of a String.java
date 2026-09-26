class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(int i = 0; i < knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        int i = 0;
        StringBuilder answ = new StringBuilder();
        while(i < s.length()){
            if(s.charAt(i) == '('){
                int j = i + 1;
                StringBuilder ans = new StringBuilder();
                while(s.charAt(j) != ')'){
                    ans.append(s.charAt(j));
                    j++;
                }
                String ans1 = new String(ans);
                if(map.containsKey(ans1)){
                    answ.append(map.get(ans1));
                }
                else{
                    answ.append('?');
                }
                i = j + 1;
            }
            else{
                answ.append(s.charAt(i));
                i++;
            }
        }
        String ans2 = new String(answ);
        return ans2;
    }
}