import java.util.*;
public class Main{
  public static void main(String[]args){
    int [][]arr = {
      {3,2,1},
      {5,6,2,3},
      {7,8,9,2,3},
      {2}
    };
    List<Integer> ans = common(arr);
    System.out.println(ans);
  }
  static List<Integer> common(int [][]nums){
    List<Integer> asn = new ArrayList<>();
    if(nums.length == 0 || nums.length == 1){
      asn.add(-1);
      return asn;
    }
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0;i < 1;i++){
      for(int j = 0;j < nums[i].length;j++){
        set.add(nums[i][j]);
      }
    }
    for(int i = 1;i < nums.length;i++){
      List<Integer> ans = new ArrayList<>();
      for(int j = 0;j < nums[i].length;j++){
        ans.add(nums[i][j]);
      }
      HashSet<Integer> ans1 = new HashSet<>();
      for(int k = 0;k < ans.size();k++){
        if(set.contains(ans.get(k))){
          ans1.add(ans.get(k));
        }
      }
      Iterator<Integer> it = set.iterator();
      while(it.hasNext()){
        int p = it.next();
        if(!ans1.contains(p)){
          it.remove();
        }
      }
      if(set.size() == 0){
        asn.add(-1);
        return asn;
      }
    }
    List<Integer> ans2 = new ArrayList<>();
    for(int p: set){
      ans2.add(p);
    }
    return ans2;
  }
}