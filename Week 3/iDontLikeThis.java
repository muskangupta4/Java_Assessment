import java.util.*;

public class Solution {

    public static String iDontLikeThis(String... args) {
        String a="I Don't like ";
        int i;
        for(i=0;i<args.length-1;i++){
            a=a+args[i]+", ";
        }
        a=a+args[args.length-1]+"!";
        //System.out.println(args[0]);
        return a;
    }

    public static void main(String args[]) {
        assert (iDontLikeThis("chocolate", "pizza").equals("I Don't like chocolate, pizza!"));
    }
}
