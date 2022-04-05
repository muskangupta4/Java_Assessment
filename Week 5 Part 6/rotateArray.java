import java.util.*;

public class Solution {


    static int[] rotateArray(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] arr=new int[n];
        for(int i = 0; i < n; i++){
            if(i<k){
                arr[i]=nums[n + i - k];
            }
            else{
                arr[i]=nums[i-k];
            }
        }
        return arr;
   
    }

    public static void main(String args[]) {

        int[] nums1= {1,2,3,4,5};
        int[] expected1 = {4,5,1,2,3};
        assert (Arrays.equals((rotateArray(nums1, 2)),expected1));

        int nums2[] = {12,35,48,59};
        int expected2[] = {48,59,12,35};
        assert (Arrays.equals((rotateArray(nums2, 6)),expected2));
    }
}

