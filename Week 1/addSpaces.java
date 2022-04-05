import java.util.*;

public class Solution {

    public static String addSpaces(String... words) {

        String s = "";
        for(int i=0;i<words.length;i++){
            s+=(words[i]);

            if(i!=words.length-1){
                s+=" ";
            }
        }


        return s;
        
    }

    public static void main(String args[]) {
        String[] arr = { "Hello", "World" };
        assert (addSpaces(arr).equals("Hello World"));
    }
}

