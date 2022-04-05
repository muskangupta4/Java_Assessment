import java.util.*;

public class Solution {

    static String touristGreeting(String nationality) {
        if (nationality.equals("Wonderland")) {
            return "Welcome back!";
        }
        
        else if(nationality.equals("wonderland")){
            return "Welcome back!";
        }
        else{
            return String.format("Welcome to Wonderland, citizen from %s!",nationality);

        }

       

        

    }

    public static void main(String args[]) {
        String nationality = "Wakanda";
        assert (touristGreeting(nationality).equals("Welcome to Wonderland, citizen from Wakanda!"));
        nationality = "Wonderland";
        assert (touristGreeting(nationality).equals("Welcome back!"));
    }
}

