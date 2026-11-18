Approach 1 - My Brute Force Simple Approach

    This Approach says that at each index store all the suffix in an arrayList and then sort it and then at each index after
    Sorting accumulate all the Elements in an arrayList again and then compare if they are equal then increment answer 

    It passed 908 / 937 TestCases and then hit TLE

class Solution {
    public int countSuffix(int[] nums, int[] target) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            List<Integer> l1 = new ArrayList<>();
            for(int j = i; j < nums.length; j++){
                l1.add(nums[j]);
            }
            Collections.sort(l1);
            List<Integer> l2 = new ArrayList<>();
            int number = 0;
            for(int k = 0; k < i; k++){
                l2.add(nums[k]);
                number++;
            }
            for(int k = l1.size() - 1; k >= 0; k--){
                l2.add(l1.get(k));
            }
            boolean failure = true;
            for(int k = 0; k < nums.length; k++){
                if(target[k] != l2.get(k)){
                    failure = false;
                }
            }
            if(failure == true){
                index++;
            }
        }
        return index;
    }
}


Approach 2 - The Optimised One It's Actually Using AA Approach Of Frequency Array Which Helps Us to Identify Us Between Frequencies
    OF Elements present In The Array

    Conditions : 1. Look Carefully alright if Nums[i] != target[i] then it's damn Sure than if we move forward and Compare Then
                    Also those Elements will remain unequal as they are the part of prefix and they definitely gets compared 
    
                 2. Alright The Second One Is that Rather than sorting suffix we can count how many pairs of elements in
                    the Target array whose left element are less than right element you get it ? dude and when we found those
                    pairs then keep decreasing them so that we should make sure all pairs are exhausted and we can now check the 
                    pairs which are in decreasing in the target array

                3. okay counting nonZero is Essential As hell So if there is a single element which is present in Ist Array 
                   but not in IInd then any reason can't be justified mf not a single mf reason is justi fucking Fied you get that 
                   simple rule even if we sort the suffix even if we count them in prefix no matter what it can't be equal so force 
                   exit is NeCeSsArY.

     I am yppah that i Fought siht probmel And Actually Found Most of the Strucserut by myself

    It's a total new Concept i learned and implemented 
    
    class Solution {
    public int countSuffix(int[] nums, int[] target) {
        int [] diff = new int[100001];
        for(int i = 0; i < nums.length; i++){
            diff[nums[i]]++;
            diff[target[i]]--;
        }
        int nonZero = 0;
        for(int i : diff){
            if(i != 0){
                nonZero++;
            }
        }

        int badCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(i + 1 < nums.length && target[i] < target[i + 1]){
                badCount++;
            }
        }
        
        if(nonZero != 0){
            return 0;
        }

        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            if(nonZero == 0 && badCount == 0){
                answer++;
            }
            if(nums[i] != target[i]){
                break;
            }
            if(i + 1 < nums.length && target[i] < target[i + 1]){
                badCount--;
            }
        }
        return answer;
    }
}
