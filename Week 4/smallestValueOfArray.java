import java.util.*;

public class Solution {

    static int smallestValueOfArray(int[] numbers, String toReturn) {
        int low=numbers[0],i,ind=0;
        for(i=0;i<numbers.length;i++){
            if(numbers[i]<low){
                low=numbers[i];
                ind=i;
            }

        }
        if(toReturn=="value"){
            return low;
        }
        else{
            return ind;
        }

    }

    public static void main(String args[]) {
        assert (1 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "value"));
        assert (3 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "index"));
    }
}

