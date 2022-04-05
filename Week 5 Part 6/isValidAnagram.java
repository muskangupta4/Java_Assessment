import java.util.*;

public class Solution {

    static boolean isValidAnagram(String s, String t) {
        boolean b;
        if(s.length()!=t.length()){
            b=false;
            //System.out.println(b);
            return b;
        }
        
        char temp1[] = s.toCharArray();
        char temp2[] = t.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        String a = String.valueOf(temp1);
        String b1 = String.valueOf(temp2);
        //System.out.println(a);
        //System.out.println(b1);
        if(a.equals(b1)){
            b=true;
            //System.out.println(b);
            return b;
        }
        else{
            b=false;
            //System.out.println(b);
            return b;
        }
        
    }

    public static void main(String args[]) {

        String a1 = "anagram";
        String a2 = "nagaram";
        assert (isValidAnagram(a1, a2) == true);

        String b1 = "rat";
        String b2 = "car";
        assert (isValidAnagram(b1, b2) == false);
    }
}

