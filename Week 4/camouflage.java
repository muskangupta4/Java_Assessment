import java.util.*;

public class Solution {

    static String[] camouflage(String ninja, String[] words) {
        List<String> list=new ArrayList<String>();
        ninja = ninja.toLowerCase();
        for(int i=0;i<words.length;i++){
            if(words[i].toLowerCase().contains(ninja)){
                list.add(words[i]);
            }
        }
        

        if(list.size()>0){
            String[] stringArray = list.toArray(new String[0]);
            return stringArray;
        } else{
            list.add("Empty");
            String[] stringArray = list.toArray(new String[0]);
            
            
            return stringArray;
        }
    }

    public static void main(String args[]) {
        String[] words1 = { "Merchandise", "mermaid", "commercial" };
        String ninja = "Merc";
        String[] result1 = { "Merchandise", "commercial" };
        assert (Arrays.equals(camouflage(ninja, words1), result1));

        String[] words2 = { "mountain", "forest", "city" };
        ninja = "hattori";
        String[] result2 = { "Empty" };
        assert (Arrays.equals(camouflage(ninja, words2), result2));
    }
}
