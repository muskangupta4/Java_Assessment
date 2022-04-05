import java.util.*;

public class Solution {

    static String noSpace(String s) {
        s = s.replaceAll("\\s", "");
        return s;
    }

    public static void main(String args[]) {
        assert (noSpace("Get Out!!").equals("GetOut!!"));
        assert (noSpace("Please come in.").equals("Pleasecomein."));
    }
}

