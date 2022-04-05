import java.util.*;

public class Solution {

    static String jeeResult(String marks) {
        
        String[] l = marks.split(" ");
        int high=Integer.parseInt(l[0]),low=Integer.parseInt(l[0]),i;
        
        for(i=0;i<l.length;i++){
            String r=l[i];
            int e=Integer.parseInt(r); 
            if(e>high){
                high=e;
            }
            else if(e<low){
                low=e;
            }
        }
        String n=Integer.toString(high)+" "+Integer.toString(low);
        System.out.println(n);
        return n; 


    }

    public static void main(String args[]) {
        assert (jeeResult("4 2 -13 4 5").equals("5 -13"));
    }
}

