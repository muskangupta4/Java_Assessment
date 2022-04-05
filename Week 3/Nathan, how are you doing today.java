import java.util.*;

public class Solution {

    static String greeting(String name) {
        String ans="Hey "+name+", how are you doing today?";
        return ans;
    }

    public static void main(String args[]) {
        String name = "Nathan";
        assert (greeting(name).equals("Hey Nathan, how are you doing today?"));
    }
}

