import java.util.*;

public class Solution {

    static boolean isLochNessMonster(String s) {
        boolean a = s.contains("tree fiddy");
        boolean b = s.contains("3.50");
        boolean c = s.contains("three fifty");
        if(a==true){
            return true;
        }
        else if(b==true){
            return true;
        }
        else if(c==true){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]) {
        String s = "Your girlscout cookies are ready to ship. Your total comes to tree fiddy.";
        assert (isLochNessMonster(s) == true);
        s = "Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance.";
        assert (isLochNessMonster(s) == false);
    }
}
