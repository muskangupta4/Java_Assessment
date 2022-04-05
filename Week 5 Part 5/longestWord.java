import java.util.*;

public class Solution {

  static int longestWord(String str) {
    String[] spl = str.split(" ");
    int longest = 0;
    for (int i = 0; i < spl.length; i++) {
      if (spl[i].length() > longest) {
        longest = spl[i].length();
      }
    }
    return longest;
  }

  public static void main(String args[]) {
    assert (longestWord("Who is there?") == 6);
  }
}

