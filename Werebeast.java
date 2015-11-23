import java.util.Random;
/**
 * Werebeast have same hp but are a bit stronger,they can also chain attacks at the cost of their health
 * 
 * @author Daniel Bionat 
 * @version 1.something
 */
public class Werebeast extends Creature
{
    // instance variables - replace the example below with your own
    private int strength;
    private int hp;
    private Random roll;

    /**
     * Constructor for objects of class Werebeast
     * Races other than human get gifted bonus if rng makes them retarded
     */
    public Werebeast()
    {
        super();
        roll = new Random();
        strength = roll.nextInt(20);
        if (strength < 5)
        {
            strength = strength + roll.nextInt(20);
        }
        hp = roll.nextInt(30);
        if (hp < 7)
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
    public Werebeast(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
        if (this.strength > 20)
        {
            this.strength = 20;
        }
        if (this.hp > 30)
        {
            this.hp = 30;
        }
        
    }
    
    /**
     * Chain attack!
     */
    public int damage()
    {
        int dmg = super.damage();
        while (roll.nextFloat() >= 0.60)
        {
            dmg = dmg + roll.nextInt(strength);
            hp = hp - (dmg / 10);
            if (hp < 0)
            {
                hp = 1;
            }
        }
        return dmg;
    }
}