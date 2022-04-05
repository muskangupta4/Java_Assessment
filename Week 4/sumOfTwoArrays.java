import java.util.*;

public class Solution {

    public static int sumOfTwoArrays(int[] arr1, int[] arr2) {
        int i,sum=0;
        for(i=0;i<arr1.length;i++){
            sum=sum+arr1[i];
        }
        for(i=0;i<arr2.length;i++){
            sum=sum+arr2[i];
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String args[]) {
        assert (sumOfTwoArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }) == 21);
    }
}

