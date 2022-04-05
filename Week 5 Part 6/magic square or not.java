import java.util.*;

public class Solution {

    static boolean isMagicSquare(int[][] arr) {
        int n=arr.length;
        int sum=0,r=0,c=0,ld=0,rd=0,i,j;
        for(j=0;j<n;j++){
            sum=sum+arr[0][j];
        }
        for(i=1;i<n;i++){
            for(j=0;j<n;j++){
                r=r+arr[i][j];
            }
            if(r!=sum){
                return false;
            }
            r=0;
        }
        for(j=0;j<n;j++){
            for(i=0;i<n;i++){
                c=c+arr[i][j];
            }
            if(c!=sum){
                return false;
            }
            c=0;
        }
        for(i=0;i<n;i++){
                ld=ld+arr[i][i];
            }
        if(ld!=sum){
            return false;
        }
        for(i=0;i<n;i++){
                rd=rd+arr[i][n-1-i];
            }
        if(rd!=sum){
            return false;
        }
        return true;
        

    }

    public static void main(String args[]) {

        int[][] arr1 = {{4,9,2}, {3,5,7}, {8,1,6}};
        assert (isMagicSquare(arr1) == true);

        int[][] arr2 = {{4,9,2}, {3,5,9}, {8,1,6}};
        assert (isMagicSquare(arr2) == false);
    }
}

