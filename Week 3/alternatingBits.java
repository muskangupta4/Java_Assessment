import java.util.*;

public class Solution {

    static String alternatingBits(int size, int startingBit) {
        String s="";
        int i;
        if(startingBit==0){
            s=s+"0";
            for(i=1;i<size;i++){
                if(i%2==1){
                s=s+"1";
                }
                else{
                    s=s+"0";
                }
        }


            }
            else if(startingBit==1){
            s=s+"1";
            for(i=1;i<size;i++){
                if(i%2==1){
                s=s+"0";
                }
                else{
                    s=s+"1";
                }
        }


            }
        
        return s;
            
    }

    public static void main(String args[]) {
        int size = 6, startingBit = 0;
        assert (alternatingBits(size, startingBit).equals("010101"));
        size = 5;
        startingBit = 1;
        assert (alternatingBits(size, startingBit).equals("10101"));
    }
}

