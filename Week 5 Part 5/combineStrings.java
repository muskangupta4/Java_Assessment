import java.util.*;

public class Solution {

    public static String combineStrings(String s1, String s2) {
    String one="";
    String two="";
    
    LinkedHashSet<Character> set = new LinkedHashSet<>();  
    LinkedHashSet<Character> set2 = new LinkedHashSet<>(); 
    for(int i=0;i<s1.length();i++)   
        set.add(s1.charAt(i)); 
    for(Character ch : set){
        one=one+ch;
    } 
    for(int j=0;j<s2.length();j++)   
        set2.add(s2.charAt(j)); 
    for(Character ch2 : set2){
        two=two+ch2;
    }  
    String add=one+two;
    String fin="";
    LinkedHashSet<Character> set3 = new LinkedHashSet<>(); 
    for(int k=0;k<add.length();k++)   
        set3.add(add.charAt(k)); 
    for(Character ch3 : set3){
        fin=fin+ch3;
    } 
    //System.out.println(fin); 
    char tempArray[] = fin.toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray);
    }

    public static void main(String args[]) {
        assert (combineStrings("aaab", "bjjj").equals("abj"));
    }
}

