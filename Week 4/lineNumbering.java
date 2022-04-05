import java.util.*;

public class Solution {

    static List<String> lineNumbering(List<String> lines) {
        int i;
        for(i=0;i<lines.size();i++){
            int k=i+1;
            String c=Integer.toString(k);
            String r=c+" "+lines.get(i); 
            //System.out.print(c);
            lines.set(i,r);
            //System.out.print(lines.get(i));
        }
        return lines;
    }

    public static void main(String args[]) {
        // assert(Arrays.asList()==lineNumbering(Arrays.asList()));
        assert (lineNumbering(Arrays.asList("Hi", "Hello", "Hey")).equals(Arrays.asList("1 Hi", "2 Hello", "3 Hey")));
    }
}
