import java.util.*;

public class Solution {

    public static String theNextZombie(String[] arr) {
        int i;
        String s="";
        for(i=0;i<arr.length-1;i++){
            if(arr[i]=="Zombie"){
                s="Run away "+arr[i+1]+"!";
                //System.out.print(s);
                
            }
        }
        return s;
    }

    public static void main(String args[]) {
        String[] array = { "Anil", "Zombie", "Pulkit", "Chinmay" };
        assert (theNextZombie(array).equals("Run away Pulkit!"));
    }
}
