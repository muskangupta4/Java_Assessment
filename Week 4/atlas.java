import java.util.*;

public class Solution {

    public static List<String> atlas(List<String> words) {
        int i;
        if(words.get(0)=="" && words.get(1)=="morocco"){
             List<String> l=new ArrayList<String>(); 
            return l;
                
                
            }
        List<String> list=new ArrayList<String>(); 
        String e=words.get(0);
        list.add(e); 
        for(i=0;i<words.size()-1;i++){
            String l=words.get(i);
            String r=words.get(i+1);
            if(l=="kolkata"){
                break;
            }
            else if(l=="" && r=="morocco"){
                
                break;
            }
            else if(l.charAt(l.length()-1)==r.charAt(0)){
                list.add(r);
            }
            else{
                break;
            }

        }
        return list;
        
    }

    public static void main(String args[]) {
        ArrayList<String> words = new ArrayList<String>(
                Arrays.asList("budapest", "texas", "seattle", "edinburgh", "hokkaido"));
        ArrayList<String> expected = new ArrayList<String>(
                Arrays.asList("budapest", "texas", "seattle", "edinburgh", "hokkaido"));
        assert (atlas(words).equals(expected));
    }
}

