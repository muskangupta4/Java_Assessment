import java.util.*;

public class Solution {

    static String reverseWords(String string) {
        StringBuilder input1 = new StringBuilder();
        input1.append(string);
        input1.reverse();
        String singleString = input1.toString();
        return singleString;
    }

    public static void main(String args[]) {
        String string = "Cat";
        assert (reverseWords(string).equals("taC"));
        string = "cart";
        assert (reverseWords(string).equals("trac"));
    }
}

