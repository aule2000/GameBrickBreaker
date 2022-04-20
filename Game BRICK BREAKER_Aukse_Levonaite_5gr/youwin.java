import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class youwin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class youwin extends World
{
     public win player = new win();
    /**
     * Constructor for objects of class youwin.
     * 
     */
    public youwin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage bgImage = new GreenfootImage(1,1);
        bgImage.setColor(Color.BLACK);
        bgImage.drawRect(0,0,1,1);
        setBackground(bgImage);
        showText("YOU WIN",getWidth()/2,getHeight()/2);
        showText("Press enter to restart",300,300);
        addObject(player, 580, 550);
    }
}
