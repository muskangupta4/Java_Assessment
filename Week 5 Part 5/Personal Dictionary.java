import java.util.*;

public class Solution {
    Dictionary dict = new Hashtable();


    public Solution() { // constructor
        // your code
        
    }

    public void addWord(String key, String value) {
        // your code
        dict.put(key,value);
    }

    public String lookUp(String key) {
        // your code
        //key="Kiwi";
        String r=(String)dict.get(key);
        if(r==null){
            String t="No entry found for "+key;
            //System.out.println(t);
            return t;
        }
        else{
           // System.out.println(r);
        return r;

        }
        
    }

    public static void main(String args[]) {
        Solution dict = new Solution();
        dict.addWord("Mango", "A yellow colored fruit");
        assert (dict.lookUp("Mango").equals("A yellow colored fruit"));
        assert (dict.lookUp("Kiwi").equals("No entry found for Kiwi"));
    }
}
