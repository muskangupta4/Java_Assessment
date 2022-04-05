import java.util.*;

public class Solution {

    static String hidePhoneNumber(String s) {
        int i;
        for(i=0;i<s.length()-3;i++){
            s = s.substring(0, i) + "*"+ s.substring(i + 1);

        }
        return s;

    }

    public static void main(String args[]) {
        assert (hidePhoneNumber("9090213229").equals("*******229"));
    }
}

