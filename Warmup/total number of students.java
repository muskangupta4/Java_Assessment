import java.util.*;

public class Solution {

    static int totalStudents(int[][] matrix) {
        int count=0;
        int i,j;
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                count=count+matrix[i][j];
            }
        }
        System.out.print(count);
        return count;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 0 }, { 0, 1 } };
        assert (totalStudents(arr) == 2);
    }
}

