import java.util.*;


public class Solution {

    public static List<Integer> filterEven(List<Integer> inputList) {
        //int l=0;
        List<Integer> list=new ArrayList<Integer>();  
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) % 2 != 0) {
                list.add(inputList.get(i));
                //inputList.remove(i);
                //l=l+1;
            }
        }
        System.out.println(list);
        return list;
    }

    public static void main(String args[]) {
        List<Integer> inputList = new LinkedList<>(Arrays.asList(1, 2, 6, 7, 9, 10));
        List<Integer> expectedOutputList = new LinkedList<>(Arrays.asList(1, 7, 9));
        assert (filterEven(inputList).equals(expectedOutputList));
    }
}

