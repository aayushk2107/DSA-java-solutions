class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int globalLength=0;
        int length=0;
        int left=0;
        for(int i=0;i<fruits.length;i++){
            if(map.size()<=2){
                map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
                length++;
            }
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
                length--;
            }
            if(globalLength<length){
                    globalLength=length;
                }
        }
        return globalLength;
    }
}