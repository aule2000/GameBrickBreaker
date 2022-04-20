import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class gameove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameove extends Actor
{
    public World gameover;  
    /**
     * Act - do whatever the gameove wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if (Greenfoot.isKeyDown("enter"))
            {
                Greenfoot.setWorld(new MyWorld());
            }
            else
            Greenfoot.stop();
    }    
}
