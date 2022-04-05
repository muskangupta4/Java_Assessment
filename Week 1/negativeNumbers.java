public class Solution {
    public static int negativeNumbers(int number) {
        
        if(number>0){
            return number-(2*number);
        }
        else{
            return number;
        }

    }

    public static void main(String[] args) {
        int number = 5;
        assert(negativeNumbers(number)==-5);
        number = -3;
        assert(negativeNumbers(number)==-3);
    }
}
