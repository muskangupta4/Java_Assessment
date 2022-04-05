import java.util.*;

public class Solution {

    public int beets;

    public Solution() {
        this.beets = 0;
    }

    public int Get() {
        return beets;
    }

    public void Set(int beets) {
        this.beets=100;
    }

    public static void main(String args[]) {
        Solution ob = new Solution();
        ob.Set(21);
        assert (ob.Get() == 21);
    }
}

