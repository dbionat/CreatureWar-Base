import java.util.Random;
/**
 * Elf Class, same hp, slightly less attack, but dmg magic change!
 * 
 * @author Daniel Bionat 
 * @version 1.something
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private int strength;
    private int hp;
    private Random roll;

    /**
     * Constructor for objects of class Elf
     * Races other than human get gifted bonus if rng makes them retarded
     */
    public Elf()
    {
        super();
        roll = new Random();
        strength = roll.nextInt(12);
        if (strength < 3)
        {
            strength = strength + roll.nextInt(12);
        }
        hp = roll.nextInt(30);
        if (hp < 8)
        {
            hp = hp + roll.nextInt(30);
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Elf(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
        if (this.strength > 12)
        {
            this.strength = 12;
        }
        if (this.hp > 30)
        {
            this.hp = 30;
        }
        
    }
    
    /**
     * extra damage for Elfs!
     */
    public int damage()
    {
        int dmg = super.damage();
        if (roll.nextFloat() >= 0.9)
        {
            dmg *= 2;
        }
        return dmg;
    }
}