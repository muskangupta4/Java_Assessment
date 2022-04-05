import java.util.*;

public class Solution {

  static int[] distinctNumbers(int[] list) {
    int newLength = list.length;
    for (int i = 1; i < list.length; i++) {
        for (int j = 0; j < i; j++) {
            if (list[i] == list[j]) {  
                newLength--;
                break;
            }
        }
    }

    int[] newArray = new int[newLength]; 
    newArray[0] = list[0];  
    int inx = 1;            
    boolean isDuplicate;

    for (int i = 1; i < list.length; i++) {
        isDuplicate = false;
        for (int j = 0; j < i; j++) {
            if (list[i] == list[j]) {  
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {    
            newArray[inx] = list[i];
            inx++;
        }
    }
    return newArray;
  }

  public static void main(String args[]) {
    assert (Arrays.equals(new int[] { 3, 2, 1, 11 }, distinctNumbers(new int[] { 3, 2, 3, 3, 1, 11, 11, 1, 2, 3 })));
  }
}
