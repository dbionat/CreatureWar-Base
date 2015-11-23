import java.util.Random;
/**
 * Fairy Class, low hp and attack, but has a nice amount of lifesteal
 * 
 * @author Daniel Bionat 
 * @version 1.something
 */
public class Fairy extends Creature
{
    // instance variables - replace the example below with your own
    private int strength;
    private int hp;
    private Random roll;

    /**
     * Constructor for objects of class Elf
     * Races other than human get gifted bonus if rng makes them retarded
     */
    public Fairy()
    {
        super();
        roll = new Random();
        strength = roll.nextInt(8);
        if (strength < 2)
        {
            strength = strength + roll.nextInt(8);
        }
        hp = roll.nextInt(20);
        if (hp < 5)
        {
            hp = hp + roll.nextInt(20);
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Fairy(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
        if (this.strength > 8)
        {
            this.strength = 8;
        }
        if (this.hp > 20)
        {
            this.hp = 20;
        }
        
    }
    
    /**
     * Flat damage for Demons!
     */
    public int damage()
    {
        int dmg = super.damage();
        if (roll.nextFloat() >= 0.50)
        {
            hp = hp + dmg;
        }
        return dmg;
    }
}