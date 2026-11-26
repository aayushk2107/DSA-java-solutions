class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> l1 = new ArrayList<>();
        Stack<Integer> s1 = new Stack<>();
        int i = 0;
        int n = asteroids.length;
        while(i < n){
            boolean info = false;
            while(i < n && !s1.isEmpty() && asteroids[i] < 0){
                if(s1.peek() > 0){
                    int element1 = Math.abs(asteroids[i]);
                    if(s1.peek() == element1){
                        s1.pop();
                        i++;
                        info = true;
                        break;
                    }
                    else if(s1.peek() < element1){
                        s1.pop();
                    }
                    else if(s1.peek() > element1){
                        i++;
                        info = true;
                        break;
                    }
                }
                else{
                    break;
                }
            }
            if(i < asteroids.length && info == false){
                s1.push(asteroids[i]);
            }
            if(info == false){
                i++;
            }
        }
        while(!s1.isEmpty()){
            int element = s1.pop();
            l1.add(element);
        }
        int [] arr = new int[l1.size()];
        int index = 0;
        for(int j = l1.size() - 1; j >= 0; j--){
            arr[index] = l1.get(j);
            index++;
        }
        return arr;
    }
}