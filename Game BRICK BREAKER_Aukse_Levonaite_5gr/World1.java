import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 
 * 
 * @author.Aukse Levonaite 5 grupe
 
 */
public class World1 extends World
{

    /**
     * Constructor for objects of class World1.
     * 
     */
     public uzrasas player = new uzrasas();
    public World1()
    {    

        super(580, 550, 1); 
        prepare();
    }
    
    public void prepare()
    {

        addObject(player, 580, 550);

    }
}
