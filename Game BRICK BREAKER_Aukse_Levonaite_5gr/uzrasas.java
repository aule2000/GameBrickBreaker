import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.*;
//import java.awt.Font.PLAIN;
/**
 * Write a description of class uzrasas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class uzrasas extends Actor
{
    /**
     * Act - do whatever the uzrasas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public World World1;
    
    public void act() 
    {
        text1("BRICK BREAKER");
       Greenfoot.delay(40);
      
      getWorld().showText("Press enter to start", 300,400);
       if (Greenfoot.isKeyDown("enter"))
            {
                Greenfoot.setWorld(new MyWorld());
            }
            else{
                Greenfoot.stop();
            }
            
            
    } 
    public void text1(String text){
       GreenfootImage img = new GreenfootImage (900, 600); 
       img.setColor(Color.RED);  
       img.setFont(new Font("Helvetica", 40));
       img.drawString(text, 30, 30); 
       setImage(img);   
    }
    
}
