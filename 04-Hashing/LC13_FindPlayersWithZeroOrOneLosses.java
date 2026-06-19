class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            int winner=matches[i][0];
            int losser=matches[i][1];
            if(!map.containsKey(winner)){
                map.put(winner,0);
            }
            if(map.containsKey(losser)){
                map.put(losser,map.get(losser)+1);
            }
            else{
                map.put(losser,1);
            }
        }
        ArrayList<Integer> a0=new ArrayList<>();
        ArrayList<Integer> a1=new ArrayList<>();
        for(int player : map.keySet()){
            int losses=map.get(player);
            if(losses==0){
                a0.add(player);
            }
            if(losses==1){
                a1.add(player);
            }
        }
        Collections.sort(a0);
        Collections.sort(a1);

        List<List<Integer>> ans=new ArrayList<>();
        ans.add(a0);
        ans.add(a1);

        return ans;
    }
}