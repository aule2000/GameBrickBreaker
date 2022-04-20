import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{
    public Player3 player1 = new Player3();
    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(580, 550, 1); 
        prepare();
    }
    public void prepare()
    {
        
        addObject(player1, 300, 500);
        for (int i =0;i<7;i++)
            for (int j =0;j<9;j++)
            addObject(new Block(), 50+80*i,20+30*j);
        Ball3 ball = new Ball3(player1,this);
        addObject(ball,300,450);
    }
}
