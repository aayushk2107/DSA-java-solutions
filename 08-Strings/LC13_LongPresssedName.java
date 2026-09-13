class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(typed.length() < name.length()){
            return false;
        }
        int pointer = 0;
        int pointer2 = 0;
        while(pointer < name.length() && pointer2 < typed.length()){
            if(name.charAt(pointer) != typed.charAt(pointer2)){
                return false;
            }
            else{
                pointer++;
                pointer2++;
                if(pointer < name.length() && pointer2 < typed.length() && name.charAt(pointer) != typed.charAt(pointer2) && typed.charAt(pointer2) == typed.charAt(pointer2 - 1)){
                    while(pointer2 < typed.length() - 1 && typed.charAt(pointer2) == typed.charAt(pointer2 + 1)){
                        pointer2++;
                    }
                }
                else if(pointer < name.length() && pointer2 < typed.length() && name.charAt(pointer) != typed.charAt(pointer2) && typed.charAt(pointer2) != typed.charAt(pointer2 - 1)){
                    return false;
                }
                else{
                    continue;
                }
            }
            pointer2++;
        }
        if(pointer == name.length()){
            while(pointer2 < typed.length() &&  typed.charAt(pointer2) == name.charAt(pointer - 1)){
                pointer2++;
            }
        }
        return pointer == name.length() && pointer2 == typed.length();
    }
}