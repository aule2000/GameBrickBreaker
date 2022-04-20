import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Player player = new Player();
    public Cloud cloud = new Cloud();
    public MyWorld()
    {    
        super(580, 600, 1);
            
        prepare();
    }
    public void prepare()
    {
        addObject(cloud, 210, 300);
        addObject(player, 300, 500);
        for (int i =0;i<7;i++)
        for (int j =0;j<4;j++)
        addObject(new Block(), 50+80*i,20+30*j);
        Ball ball = new Ball(player,this);
        addObject(ball,300,450);
        
    }
    
}
