import java.util.*;

public class Solution {

    public static double KhalFunction(int x) {
        //double c : GetTempearature(x);
        //return c ;
        //System.out.println(16*(double)(2/9));
        //return (double)x*(2/9);
        double t=2*x;
        return t/9;
    }

    public static double GetWesterosTempearature(int x) {
        return (x * 9) / 2;
    }

    public static void main(String args[]) {
        assert (KhalFunction(9) == 2);
    }
}
