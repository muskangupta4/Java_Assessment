public class Solution {
    public static String trueOrFalse(boolean teaching) {
        if(teaching==true){
            System.out.print("Good");
            return "Good";
        }
        else{
            System.out.print("Bad");
            return "Bad";
        }

    }

    public static void main(String[] args) {
        boolean teaching =true;
        assert(trueOrFalse(teaching).equals("Good"));
    }
}
