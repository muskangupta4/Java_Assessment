import java.util.*;

public class Solution {

    static int typeConversion(String s) {
        int i=Integer.parseInt(s);  
        return i;
    }

    public static void main(String args[]) {
        String s = "123";
        assert (typeConversion(s) == 123);
    }
}
