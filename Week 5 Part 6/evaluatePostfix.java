import java.util.*;

public class Solution {

    static int evaluatePostfix(String exp) {
        String[] arr = exp.split(" ");
        Stack<Integer> st =new Stack<Integer>();
        for(int i = 0; i < arr.length; i++){
            
            if(!arr[i].equals("+") && !arr[i].equals("-") && !arr[i].equals("*") && !arr[i].equals("/")){
                int a = Integer.valueOf(arr[i]);
                st.push(a);
            }
            else{
                int t1 = st.pop();
                int t2 = st.pop();
                if(arr[i].equals("/")) st.push(t2 / t1);
                if(arr[i].equals("*")) st.push(t2 * t1);
                if(arr[i].equals("+")) st.push(t2 + t1);
                if(arr[i].equals("-")) st.push(t2 - t1);
            }
        }
        return st.pop();
    }

    public static void main(String args[]) {

        assert (evaluatePostfix("2 3 +") == 5);
        assert (evaluatePostfix("4 13 5 / +") == 6);

    }
}
