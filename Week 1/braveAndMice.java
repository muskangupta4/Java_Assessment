public class Solution {
    public static String braveAndMice(String animal) {
        if(animal.equalsIgnoreCase("Mouse")){
            return "Hide";
        }
        else{
            return "Walk";
        }

    }

    public static void main(String[] args) {
        String animal = "Dog";
        assert(braveAndMice(animal).equals("Walk"));
        animal = "Mouse";
        assert(braveAndMice(animal).equals("Hide"));
    }
}
