import java.util.*;

public class Solution {

    static String stringMerge(String a, String b) {
        String l;
        String s;
        if(a.length()>b.length()){
            l=a;
            s=b;
        }
        else{
            s=a;
            l=b;
        }
        StringBuilder input1 = new StringBuilder();
        input1.append(s);
        input1.reverse();
        String r=l+input1+l;
        return r;
    }

    public static void main(String args[]) {
        assert (stringMerge("tim", "cook").equals("cookmitcook"));
    }
}

