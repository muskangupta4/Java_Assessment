import java.util.*;

public class Solution {

    static String findLanguage(String country) {
        if(country=="Australia" ){
            return "English" ;
        }
        else if(country=="England" ){
            return "English" ;
        }
        else if(country=="Brazil" ){
            return "Portuguese" ;
        }
        else if(country=="China" ){
            return "Chinese";
        }
        else if(country=="France" ){
            return "French" ;
        }
        else if(country=="Spain" ){
            return "Spanish" ;
        }
        else if(country=="Germany" ){
            return "German" ;
        }
        else if(country=="Japan"){
            return "Japanese" ;
        }
        else if(country=="Greece" ){
            return "Greek" ;
        }
        else if(country=="India" ){
            return "Hindi" ;
        }
        return "0";
    }

    public static void main(String args[]) {
        assert (findLanguage("Australia").equals("English"));
    }
}
