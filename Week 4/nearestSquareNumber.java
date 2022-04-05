import java.util.*;

public class Solution {

    static int nearestSquareNumber(int n) {
        int i=n,j=n;
        while(true){
            double sqrt=Math.sqrt(i);
            double sqrt2=Math.sqrt(j);
            if((sqrt - Math.floor(sqrt)) == 0){
                return i;
            }
            else{
                i=i+1;
            }
            if((sqrt2 - Math.floor(sqrt2)) == 0){
                return j;
            }
            else{
                j=j-1;
            }
        }

    }

    public static void main(String args[]) {
        int n = 59;
        assert (nearestSquareNumber(n) == 64);
        n = 52;
        assert (nearestSquareNumber(n) == 49);
    }
}
