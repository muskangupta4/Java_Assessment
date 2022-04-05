import java.util.*;

public class Solution {

    static String[] reverseArray(String[] s) {
        String[] arr = new String[s.length]; 
        int i,j=0;
        for(i=s.length-1;i>=0;i--){
            arr[j]=s[i];
            j++;
        }
        return arr;
    }

    public static void main(String args[]) {
        assert (Arrays.equals(reverseArray(new String[] { "Why", "this", "kolaveridi?" }),
                new String[] { "kolaveridi?", "this", "Why" }));
    }
}

