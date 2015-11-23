import java.util.Random;
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private int strength;
    private int hp;
    private Random roll;

    /**
     * Constructor for objects of class Human
     */
    public Human()
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
    public Human(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
        if (this.strength > 18)
        {
            this.strength = 18;
        }
        if (this.hp > 30)
        {
            this.hp = 30;
        }
        
    }
}
