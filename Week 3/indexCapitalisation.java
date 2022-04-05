import java.util.*;

public class Solution {

    static String indexCapitalisation(String s, int[] ind) {
        char[] chars = s.toCharArray();
        Arrays.stream(ind)
                .filter(c -> c < s.length())
                .forEach(c -> chars[c] = Character.toUpperCase(chars[c]));
        return new String(chars);
    }

    public static void main(String args[]) {
        String s = "learn by doing";
        int[] ind = new int[] { 0, 6, 9 };
        assert (indexCapitalisation(s, ind).equals("Learn By Doing"));
    }
}
