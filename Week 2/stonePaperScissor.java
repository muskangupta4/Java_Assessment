import java.util.*;

public class Solution {

    static String stonePaperScissor(String s1, String s2) {
        if(s1=="Stone"){
            if(s2=="Stone"){
                return "Share it!";
            }
            else if(s2=="Scissor"){
                return "Tom";
            }
            else{
                return "Jerry";
            }
        }
        else if(s1=="Scissor"){
            if(s2=="Stone"){
                return "Jerry";
            }
            else if(s2=="Scissor"){
                return "Share it!";
            }
            else{
                return "Tom";
            }
        }
        else{
            if(s2=="Stone"){
                return "Tom";
            }
            else if(s2=="Scissor"){
                return "Jerry";
            }
            else{
                return "Share it!";
            }
        }
    }

    public static void main(String args[]) {
        assert (stonePaperScissor("Stone", "Paper").equals("Jerry"));
        assert (stonePaperScissor("Stone", "Stone").equals("Share it!"));
    }
}

