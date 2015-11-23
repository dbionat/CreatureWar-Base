import java.util.Random;
/**
 * Your a Hero Snake! No one would ever nuke you! gets stronger every time the hero deals damage
 * also is healed by a small chance
 * 
 * @author Daniel Bionat 
 * @version 1.something
 */
public class Hero extends Human
{
    // instance variables - replace the example below with your own
    private int strength;
    private int hp;
    private Random roll;

    /**
     * Constructor for objects of class Elf
     * Races other than human get gifted bonus if rng makes them retarded
     */
    public Hero()
    {
        super();
        roll = new Random();
        strength = roll.nextInt(18);
        hp = roll.nextInt(30);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Hero(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
        if (this.strength > 18)
        {
            this.strength = 30;
        }
        if (this.hp > 18)
        {
            this.hp = 30;
        }
        
    }
    
    /**
     * stat mods ftw!
     */
    public int damage()
    {
        int dmg = super.damage();
        strength = strength + (dmg / 3);
        if (roll.nextFloat() >= 0.90)
        {
            hp += 30;
        }
        return dmg;
    }
}