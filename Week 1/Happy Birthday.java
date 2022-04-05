import java.util.*;

public class Solution {

    static String happyBirthday(int gifts){
        String[] gifts_response = {"Hardly any", "We need some more gifts" ,"Woah that's a lot of gifts!", "Happy Birthday Jhandu!!!"};
    
        String respond = "";
    
  
            if(gifts <= 5)
                return gifts_response[0];
            if (gifts < 23)
                return gifts_response[1];
            if (gifts == 23)
                return gifts_response[3];



        return gifts_response[2];
        
        
    }

    public static void main(String args[]) {
        int gifts = 99;
        assert (happyBirthday(gifts).equals("Woah that's a lot of gifts!"));
        gifts = 23;
        assert (happyBirthday(gifts).equals("Happy Birthday Jhandu!!!"));
    }
}
