The Soltion i carried after exiting from contest

class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        HashSet<List<Integer>> set = new HashSet<>();
        int i = 0;
        List<Integer> ans2 = new ArrayList<>();
        ans2.add(0);
        ans2.add(0);
        set.add(ans2);
        int j = 0;
        while(i < grid.length){
            while(i < grid.length && j < grid[i].length){
                if(grid[i][j] == 'L'){
                    List<Integer> ans = new ArrayList<>();
                    j--;
                    ans.add(i);
                    ans.add(j);
                    if(set.contains(ans)){
                        return new int[]{i , j+1};
                    }
                    set.add(ans);
                }
                else if(grid[i][j] == 'R'){
                    List<Integer> ans = new ArrayList<>();
                    j++;
                    ans.add(i);
                    ans.add(j);
                    if(set.contains(ans)){
                        return new int[]{i,j - 1};
                    }
                    set.add(ans);
                }
                else if(grid[i][j] == 'D'){
                    List<Integer> ans = new ArrayList<>();
                    i++;
                    ans.add(i);
                    ans.add(j);
                    if(set.contains(ans)){
                        return new int[]{i - 1,j};
                    }
                    set.add(ans);
                }
                else{
                    List<Integer> ans = new ArrayList<>();
                    i--;
                    ans.add(i);
                    ans.add(j);
                    if(set.contains(ans)){
                        return new int[]{i + 1,j};
                    }
                    set.add(ans);
                }
                if(i >= grid.length){
                    return new int[]{i - 1 , j};
                }
                else if(j == -1){
                    return new int[]{0,0};
                }
                else if(i == -1){
                    return new int[]{0,j};
                }
                else if(i < grid.length && j == grid[i].length){
                    return new int[]{i , j - 1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

the solution i made after taking a hint from claude

class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        HashSet<List<Integer>> set = new HashSet<>();
        int i = 0;
        List<Integer> ans2 = new ArrayList<>();
        ans2.add(0);
        ans2.add(0);
        set.add(ans2);
        int j = 0;
        while(i < grid.length){
            while(i < grid.length && j < grid[i].length){
                if(grid[i][j] == 'L'){
                    List<Integer> ans = new ArrayList<>();
                    j--;
                    ans.add(i);
                    ans.add(j);
                    if(set.contains(ans)){
                        return new int[]{i , j+1};
                    }
                    set.add(ans);
                }
                else if(grid[i][j] == 'R'){
                    List<Integer> ans = new ArrayList<>();
                    j++;
                    ans.add(i);
                    ans.add(j);
                    if(set.contains(ans)){
                        return new int[]{i,j - 1};
                    }
                    set.add(ans);
                }
                else if(grid[i][j] == 'D'){
                    List<Integer> ans = new ArrayList<>();
                    i++;
                    ans.add(i);
                    ans.add(j);
                    if(set.contains(ans)){
                        return new int[]{i - 1,j};
                    }
                    set.add(ans);
                }
                else{
                    List<Integer> ans = new ArrayList<>();
                    i--;
                    ans.add(i);
                    ans.add(j);
                    if(set.contains(ans)){
                        return new int[]{i + 1,j};
                    }
                    set.add(ans);
                }
                if(i >= grid.length){
                    return new int[]{i - 1 , j};
                }
                else if(j == -1){
                    return new int[]{i, j + 1};
                }
                else if(i == -1){
                    return new int[]{0,j};
                }
                else if(i < grid.length && j == grid[i].length){
                    return new int[]{i , j - 1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}