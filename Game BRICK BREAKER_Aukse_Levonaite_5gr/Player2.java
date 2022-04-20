import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Actor
{
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player2(){
        getImage().setColor(Color.GREEN);
        getImage().fillRect(0,0,80,20);
    }
    public void act() 
    {
        if (Greenfoot.isKeyDown("right"))
            setLocation(getX() + 10, getY());
        if (Greenfoot.isKeyDown("left"))
            setLocation(getX() - 10, getY());
    }    
}
