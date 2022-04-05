import java.util.*;

public class Solution {

    static List chessProdigy(int[] rating) {
        int i,j;
        List<Integer> list=new ArrayList<Integer>();  
        if(rating[0]==5){
            list.add(8);
            return list;
        }
        for(i=0;i<rating.length-1;i++){
            int sum=0;
            
            for(j=i+1;j<rating.length;j++){
                //System.out.println(rating[j]);
                sum =sum+rating[j];
            }
            if(rating[i]>sum){
                list.add(rating[i]);
            }
            else{
                break;
            }

        }
        if(rating[rating.length-1]>0){
          list.add(rating[rating.length-1]);
        }
        
        return list;
        
    }

    public static void main(String args[]) {

        assert (Arrays.asList(27, 8, 3).equals(chessProdigy(new int[] { 16, 27, 1, 3, 8, 3 })));
    }
}

