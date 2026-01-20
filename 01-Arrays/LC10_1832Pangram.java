/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.*/

class Solution {
    public boolean checkIfPangram(String sentence) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }
}