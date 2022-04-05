import java.util.*;

public class Solution {
    int profit;
    Solution(int numberOfBeetsSold,int costPricePerBeet,int sellingPricePerBeet)
    {
        //n=numberOfBeetsSold;
        //c=costPricePerBeet;
        //s=sellingPricePerBeet;
        profit=numberOfBeetsSold*(sellingPricePerBeet-costPricePerBeet); 
    }
    public int Profit(){
      
        return profit;
    }
  
 
    public static void main(String args[]) {
        int numberOfBeetsSold = 2;
        int costPricePerBeet = 3;
        int sellingPricePerBeet = 4;
        Solution obj = new Solution(numberOfBeetsSold, costPricePerBeet, sellingPricePerBeet);
        assert (obj.Profit() == 2);
    }
}

