import java.util.*;

public class Solution {
    public Set<Integer> setx = new HashSet<>();

    public void AllAdd(int... numbers) {
        for (int number : numbers) {
            setx.add((int) number);
        }
    }

    public void removal(int number) {
        setx.remove((int) number);
    }

    public String showContent() {
        return Arrays.toString(setx.toArray());
    }

    public static void main(String args[]) {
        Solution obj = new Solution();
        obj.AllAdd(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        obj.removal(9);
        assert (obj.showContent().equals("[1, 2, 3, 4, 5, 6, 7, 8, 10]"));
    }
}
