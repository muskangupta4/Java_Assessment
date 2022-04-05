import java.util.*;
import java.util.Random;

public class Solution {
    //Solution(){
    
    
    
   // }

    public String GetFruit(){
        Random rand = new Random();
    int upperbound = 3;
    int f = rand.nextInt(upperbound);
    //System.out.print(f);
        String Fruit;
        if(f==0){
        Fruit="apple";
    }
    else if(f==1){
        Fruit="banana";
    }
    else{
        Fruit="orange";
    }
        //System.out.println(Fruit);
        return Fruit;

    }
    


    public static void main(String args[]) {
        Solution obj = new Solution();
        System.out.println(obj.GetFruit());
    }
}

