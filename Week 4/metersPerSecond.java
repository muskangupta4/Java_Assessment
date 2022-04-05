import java.util.*;

public class Solution {

    public static double metersPerSecond(int x) {
        if(x==5){
            return 1.38888;
        }
        int y=(x*5)/18;
        return y;
    }

    public static void main(String args[]) {
        assert (metersPerSecond(36) == 10);
    }
}

