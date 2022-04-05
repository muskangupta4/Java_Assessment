import java.util.*;

public class Solution {

    static int[] incrementNumber(int[] digits) {
        
        int i,r=0,flag=0;
        String num="";
        for(i=0;i<digits.length;i++){
            String s=String.valueOf(digits[i]);
            num=num+s;
        }
        int sum=Integer.parseInt(num); 
        int n=sum+1;
        for(i=0;i<num.length();i++){
            if(num.charAt(i)!='9'){
                flag=1;
            }
        }
        if(flag==0){
            int[] arr = new int[num.length()+1];
            for(i=num.length();i>=0;i--){
            r=n%10;
            arr[i]=r;
            n=n/10;
        }
        return arr; 
        }
        else{
            int[] arr = new int[num.length()];
            for(i=num.length()-1;i>=0;i--){
            r=n%10;
            arr[i]=r;
            n=n/10;
        }
        return arr; 
        }
               
    }

    public static void main(String args[]) {
        int[] nums1= {4,3,2,1};
        int[] expected1 = {4,3,2,2};
        assert (Arrays.equals((incrementNumber(nums1)),expected1));

        int nums2[] = {9};
        int expected2[] = {1,0};
        assert (Arrays.equals((incrementNumber(nums2)),expected2));
    }
}
