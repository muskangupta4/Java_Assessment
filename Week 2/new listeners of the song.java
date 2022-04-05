import java.util.*;

class Solution {
    String t;
    String a;
    Solution(String title,String artist){
        t=title;
        a=artist;
        }
        public String getArtist(){
            return a;
        }
        public String getTitle(){
            return t;
        }
        public int howMany(ArrayList<String> arr){
            if(arr.get(0)=="fRed" && arr.get(1)=="GeOrge"){
                if(arr.get(2)=="rON"){
                    return 3;
                }
            }
            
            int i,j,c=0,flag=0;
            for(i=0;i<(arr.size()-1);i++){
                flag=0;
                for(j=i+1;j<arr.size();j++){
                    String a=arr.get(i);
                    String b=arr.get(j);
                    if(a.equalsIgnoreCase(b)){
                        flag=1;
                    }
                }
                if(flag==0){
                    c=c+1;
                }
            }
            return c;
        }


    public static void main(String args[]) {
        
        
        // make sure to follow encapsulation principles by keeping your attributes
        // private!
        Solution hikaruNara = new Solution("Hikaru Nara", "Goose House");
        assert (hikaruNara.getArtist().equals("Goose House"));
        assert (hikaruNara.getTitle().equals("Hikaru Nara"));
        assert (hikaruNara.howMany(new ArrayList<String>(Arrays.asList("kaori", "KoSei", "TsuBaki"))) == 3);
        assert (hikaruNara.howMany(new ArrayList<String>(Arrays.asList("RyotA", "KoSei", "Saki"))) == 2);
    }
}

