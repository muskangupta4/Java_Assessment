import java.util.*;

public class Solution {

  static int peopleCount(String s) {
    int ans=0;
    char pre = 'A';
    for(int i=0;i!=s.length();i+=2)
    if(s.charAt(i)!=pre){
      ans++;
      pre=s.charAt(i);
    }
    return ans;
  }

  public static void main(String args[]) {
    assert (peopleCount("UfUfUf") == 1);
  }
}
