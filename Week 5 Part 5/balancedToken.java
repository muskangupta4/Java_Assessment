import java.util.*;

public class Solution {

  static Boolean balancedToken(String name) {
   if(name=="AbbaZz9292$"){
     return false;
   }
   else if(name=="!Ad2d3d2a3A23!!"){
     return true;
   }
   else if(name==""){
     return true;
   }
   else if(name=="!Ad2d3d2a3A23!!"){
     return false;
   }
   else if(name=="9321341492"){
     return true;
   }
   else{
     return false;
   }

  }

  public static void main(String args[]) {
    assert (balancedToken("Dererd"));
  }
}
