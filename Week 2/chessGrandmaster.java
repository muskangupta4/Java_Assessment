import java.util.*;

public class Solution {

    static String chessGrandmaster(String[] x) {
        int count=0,i;
        for(i=0;i<x.length;i++){
            if(x[i]=="Win"){
                count=count+1;
            }
        }
        if(count>=5){
            return "Grand Master";
        }
        else if(count==0){
            return "Master";
        }
        else{
            return "International Master";
        }
    }

    public static void main(String args[]) {
        assert (chessGrandmaster(new String[] { "Loss", "Loss", "Loss" }).equals("Master"));
        assert (chessGrandmaster(new String[] { "Win", "Win", "Win" }).equals("International Master"));
    }
}

