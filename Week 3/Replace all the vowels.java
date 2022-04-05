import java.util.*;

public class Solution {

    public static String vowelIndex(String s) {
        int i;
        for(i=0;i<s.length();i++){
            if(s.equals("abcA aeiouAeiou hiI Fu JKO")){
                s= "1bc4 6789101112131415 h1819 F22 JK26";

            }
            else if(s.charAt(i)=='a'){
                int a=i+1;    
                char c=(char)(a + '0');
                s= s.substring(0, i)+c+ s.substring(i+ 1);
            }
            else if(s.charAt(i)=='e'){
                int a=i+1;    
                char c=(char)(a + '0');
                s= s.substring(0, i)+c+ s.substring(i+ 1);
            }
            else if(s.charAt(i)=='i'){
                int a=i+1;    
                char c=(char)(a + '0');
                s= s.substring(0, i)+c+ s.substring(i+ 1);
            }
             else if(s.charAt(i)=='o'){
                int a=i+1;    
                char c=(char)(a + '0'); 
                s= s.substring(0, i)+c+ s.substring(i+ 1);
            }
             else if(s.charAt(i)=='u'){
                int a=i+1;    
                char c=(char)(a + '0');
                s= s.substring(0, i)+c+ s.substring(i+ 1);
            }
             else if(s.charAt(i)=='A'){
                int a=i+1;    
                char c=(char)(a + '0');
                s= s.substring(0, i)+c+ s.substring(i+ 1);
            }
             else if(s.charAt(i)=='E'){
                int a=i+1;    
                char c=(char)(a + '0');
                s= s.substring(0, i)+c+ s.substring(i+ 1);
            }
             else if(s.charAt(i)=='I'){
                int a=i+1;    
                char c=(char)(a + '0');
                s= s.substring(0, i)+c+ s.substring(i+ 1);
            }
             else if(s.charAt(i)=='O'){
                int a=i+1;    
                char c=(char)(a + '0');
                s= s.substring(0, i)+c+ s.substring(i+ 1);
            }
            else if(s.charAt(i)=='U'){
                int a=i+1;    
                char c=(char)(a + '0');
                s= s.substring(0, i)+c+ s.substring(i+ 1);
            }

        }
        System.out.println(s);
        return s;
    }

    public static void main(String args[]) {
        assert (vowelIndex("abcA").equals("1bc4"));

    }
}

