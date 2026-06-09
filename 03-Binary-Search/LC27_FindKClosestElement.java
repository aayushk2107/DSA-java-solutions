/*1. “Am I choosing k things or choosing a position?”

If answer is:

picking k elements ❌ (hard combinatorics)
picking a contiguous block / start / split ✅

Then you are in:

window / partition / segment land

That’s step 1 recognition.

2. “Does order matter or does structure matter?”

If:

array is sorted
or monotonic property exists

Then:

optimal answer is usually contiguous or boundary-based

This immediately removes brute-force thinking.

3. “Can I compare two nearby choices cheaply?”

This is the most important one.

Ask:

If I shift my choice slightly, can I compare change locally?

Example:

window i → window i+1
only one element changes

That gives:

local difference = left removed + right added

If YES → sliding window / binary search on window

If NO → different pattern (heap, DP, etc.)*/

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start=0;
        int end=arr.length-k;
        while(start<end){
            int mid=(start+end)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=start;i<start+k;i++){
            result.add(arr[i]);
        }
        return result;
    }
}