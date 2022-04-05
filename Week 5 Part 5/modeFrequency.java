import java.util.*;

public class Solution {

    static int modeFrequency(int[] a) {
         int maxValue = 0, maxCount = 0, i, j;

      for(i = 0; i <a.length; ++i) {
         int count = 0;
         for (j = 0; j <a.length; ++j) {
            if (a[j] == a[i])
            ++count;
         }

         if (count > maxCount) {
            maxCount = count;
            maxValue = a[i];
         }
      }
      return maxCount;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 3, 3, 3, 1 };
        assert (modeFrequency(arr) == 4);
    }
}

