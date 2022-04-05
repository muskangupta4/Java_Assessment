import java.util.*;

public class Solution {

    static String swchags(String name) {
        if(name.charAt(0)=='T'){
            String s=name+" is eligible";
            return s;
        }
        else if(name.charAt(0)=='t'){
            String s=name+" is eligible";
            return s;
        }
        else{
            String s=name+" is not eligible";
            return s;
        }
    }

    public static void main(String args[]) {
        String name = "Taylor";
        assert (swchags(name).equals("Taylor is eligible"));
        name = "Lucy";
        assert (swchags(name).equals("Lucy is not eligible"));
    }
}
