import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author Daniel Bionat
 * @version 3.122A
 */
public class Creature
{
   private int hp;
   private int strength;
   private Random roll;
   
   public Creature()        //inital stats
   {
       roll = new Random();
       hp = roll.nextInt(10);
       while (hp < 5)
       {
           hp = roll.nextInt(20);
       }
       strength = roll.nextInt(10);
        while (strength < 5)
       {
           strength = roll.nextInt(20);
       }
   }
   
    /**
    * Creature creation
    * 
    */
   public Creature(int hp, int strength)
   {
       this.hp = hp;
       this.strength = strength;
   }
    
   public int damage(){
       int dmg = roll.nextInt(strength);
       return dmg;
    }
    
}
