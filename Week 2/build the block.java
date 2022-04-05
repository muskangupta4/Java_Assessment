import java.util.*;

public class Solution {
    int w,l,h;
    Solution(int arr[]){
        w=arr[0];
        l=arr[1];
        h=arr[2];

    }
    public int getLength(){
    return l;

    }
    public int getWidth(){
     return w;   
    }
    public int getHeight(){
      return h;  
    }
    public int getVolume(){
      return w*l*h;  
    }
    public int getSurfaceArea(){
        return 2*l*w+2*l*h+2*h*w;
    }

    public static void main(String args[]) {
        Solution block = new Solution(new int[] { 3, 4, 2 });
        assert (block.getLength() == 4);
        assert (block.getWidth() == 3);
        assert (block.getHeight() == 2);
        assert (block.getVolume() == 24);
        assert (block.getSurfaceArea() == 52);
    }
}
