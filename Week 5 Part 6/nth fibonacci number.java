import java.util.*;

public class Solution {

    static int getNthFibonacciNumber(int N) {
        int fib=0,i=0,j=1,k;
        for(k=0;k<N-1;k++){
            fib=i+j;
            i=j;
            j=fib;
        }
        return fib;
    }

    public static void main(String args[]) {

        assert (getNthFibonacciNumber(3) == 2);
        assert (getNthFibonacciNumber(4) == 3);

    }
}

