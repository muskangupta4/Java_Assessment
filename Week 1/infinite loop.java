import java.util.*;

public class Solution {

    public static int infiniteLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n;i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]) {
        assert (6 == infiniteLoop(3));
    }
}

