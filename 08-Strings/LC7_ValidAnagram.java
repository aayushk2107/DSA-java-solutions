class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char [] arr = s.toCharArray();
        char [] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}