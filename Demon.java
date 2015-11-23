import java.util.Random;
/**
 * Demon Class, higher base hp and attack with a flat damage bonus.
 * 
 * @author Daniel Bionat 
 * @version 1.something
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private int strength;
    private int hp;
    private Random roll;

    /**
     * Constructor for objects of class Elf
     * Races other than human get gifted bonus if rng makes them retarded
     */
    public Demon()
    {
        super();
        roll = new Random();
        strength = roll.nextInt(36);
        if (strength < 9)
        {
            strength = strength + roll.nextInt(36);
        }
        hp = roll.nextInt(50);
        if (hp < 12)
        {
            hp = hp + roll.nextInt(50);
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Demon(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
        if (this.strength > 36)
        {
            this.strength = 36;
        }
        if (this.hp > 50)
        {
            this.hp = 50;
        }
        
    }
    
    /**
     * Flat damage for Demons!
     */
    public int damage()
    {
        int dmg = super.damage();
        if (roll.nextFloat() >= 0.95)
        {
            dmg += 50;
        }
        return dmg;
    }
}