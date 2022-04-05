import java.util.*;

public class Solution {

    static String stringManipulation(String str) {
        String s;
        s=str.substring(2,str.length()-2);
        return s;
    }

    public static void main(String args[]) {
        String str = "Good Morning everyone!!";
        assert (stringManipulation(str).equals("od Morning everyone"));
        str = "coding";
        assert (stringManipulation(str).equals("di"));
    }
}

