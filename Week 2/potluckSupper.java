import java.util.*;

public class Solution {

    static boolean potluckSupper(String name, String dish) {
        int i,j;
        if(name.charAt(0)==dish.charAt(0)){
            if(name.charAt(name.length()-1)==dish.charAt(dish.length()-1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String name = "jake";
        String dish = "jaffa cake";
        assert (potluckSupper(name, dish) == true);
        dish = "butterscotch mousse";
        assert (potluckSupper(name, dish) == false);
    }
}

