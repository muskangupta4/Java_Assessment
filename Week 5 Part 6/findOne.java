import java.util.*;

public class Solution {

    static int findOne(int[] nums) {
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] nums = {0,0,1,1};
        assert (findOne(nums) == 2);

        int[] nums1 = {0,0,0,0,0};
        assert (findOne(nums1) == -1);
    }
}

