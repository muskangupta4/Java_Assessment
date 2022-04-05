import java.util.*;

public class Solution {

    static Boolean nonDecreasingArray(int[] arr) {
        int i;
        for(i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        assert (nonDecreasingArray(new int[] { 1, 2, 3 }));
    }
}
