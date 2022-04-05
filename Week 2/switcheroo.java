import java.util.*;

public class Solution {

    static String switcheroo(String s) {
        int i;
        char[] myNameChars = s.toCharArray();
        for(i=0;i<myNameChars.length;i++){
            if(myNameChars[i]=='a'){
                myNameChars[i]='b';
            }
            else if(myNameChars[i]=='b'){
                myNameChars[i]='a';
            }
        }
        s = String.valueOf(myNameChars);
        return s;
        
    }

    public static void main(String args[]) {
        String s = "aabacbaa";
        assert (switcheroo(s).equals("bbabcabb"));
    }
}

