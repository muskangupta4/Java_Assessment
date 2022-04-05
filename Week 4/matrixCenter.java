import java.util.*;

public class Solution {

    public static Integer matrixCenter(int[][] m) {
        int l=m.length;
        if(l%2==0){
            return null;
        }
        else if(l%2!=0){
            int a=l/2;
            int col=m[0].length;
            if(col%2==0){
                return null;
            }
            else if(col%2!=0){
                int s=col/2;
                return m[a][s];
            }
        }
        return null;

    }

    public static void main(String args[]) {
        assert (matrixCenter(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }) == 5);
    }
}

