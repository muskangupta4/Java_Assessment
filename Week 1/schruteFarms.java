import java.util.*;

public class Solution {

    public static String schruteFarms(int x, int y) {
        if(x<y){
            String s="Profit of "+(y-x)+" dollars!";
            System.out.print(s);
            return s;
        }
        else if(x==y){
            return "No Profit this year!";
        }
        else{
            String s="Loss of "+(x-y)+" dollars!";
            System.out.print(s);
            return s;
        }

    }

    public static void main(String args[]) {
        assert (schruteFarms(3, 3).equals("No Profit this year!"));
        //assert (schruteFarms(3, 4).equals("Profit of 1 dollars!"));
        assert (schruteFarms(3, 2).equals("Loss of 1 dollars!"));
    }
}

