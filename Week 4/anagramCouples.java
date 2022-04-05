import java.util.*;

public class Solution {

    static boolean anagramCouples(String str1, String str2) {
    String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        return status;
    }

    public static void main(String args[]) {
        String s1 = "Liam";
        String s2 = "mila";
        assert (anagramCouples(s1, s2) == true);
        s1 = "Sia";
        s2 = "Sam";
        assert (anagramCouples(s1, s2) == false);
    }
}

