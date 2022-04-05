import java.util.*;

public class Solution {

    public String f;
    public String l;

    public Solution(String firstName, String lastName) {
        f = firstName;
        l = lastName;
    }

    public String GetName() {
        String s=f + " " + l;
        return s.trim();
    }


    public static void main(String args[]) {
        Solution obj = new Solution("Dwight", "Schrute");
        System.out.println(obj.GetName());
    }
