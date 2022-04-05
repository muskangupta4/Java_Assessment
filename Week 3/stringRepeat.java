import java.util.*;

public class Solution {

    static String stringRepeat(String s, int n) {
        String a="";
        int i;
        for(i=0;i<n;i++){
            a=a+s;
        }
        return a;
    }

    public static void main(String args[]) {
        String s = "Hello";
        int n = 3;
        assert (stringRepeat(s, n).equals("HelloHelloHello"));
    }
}

