import java.util.*;

public class Solution {

    static class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
          this.name = name;
          this.health = health;
          this.damagePerAttack = damagePerAttack;
        }
      }

    public static String fightClub(Fighter fighter1, Fighter fighter2) {
      while(true){
      fighter2.health= fighter2.health-fighter1.damagePerAttack;
      fighter1.health= fighter1.health-fighter2.damagePerAttack;
      if(fighter2.health<=0){
        return fighter1.name;
        
      }
      
      else if(fighter1.health<=0){
        return fighter2.name;
        
      }
      }
    }

    public static void main(String args[]) {
        assert (fightClub(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4)).equals("Lew"));
    }
}

