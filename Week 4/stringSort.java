import java.util.*;

public class Solution {

  static String stringSort(String s) {
    if(s==null){
      return "Invalid String!";
    }
     int N = s.length();
     int [] freq = new int [256];
     for(int i = 0; i < 256; i++){
        freq[i] = 0;
    }
 
    // Count and store the frequency
    for (int i = 0; i < N; i++) {
         char character = s.charAt(i);
         int val = (int) character;
        freq[val]++;
    }
 
    // Store the result
    String a="";
    for (int i = 0; i < 256; i++) {
        for (int j = 0; j < freq[i]; j++){
          a = a + (char)i;
        }
          //    
          //System.out.print((char)i);
    }
    System.out.print(a);
    if(s.length()>0){
      return a;
    }
    else{
      return "Invalid String!";
    }
    
  }

  public static void main(String args[]) {
    assert (stringSort("hello").equals("ehllo"));
  }
}

