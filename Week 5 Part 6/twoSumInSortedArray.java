import java.util.*;

public class Solution {

    static boolean twoSumInSortedArray(int[] nums, int target) {
        int i,j;
        for(i=0;i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String args[]) {
        int[] nums = {2,4,5,8,9};
        assert (twoSumInSortedArray(nums, 7) == true);
        assert (twoSumInSortedArray(nums, 22) == false);
    }
}

