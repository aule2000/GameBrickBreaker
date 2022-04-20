import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{
public Player2 players = new Player2();
    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
    {    
        super(580, 550, 1); 
        prepare();
    }
    public void prepare()
    {
        
        addObject(players, 300, 500);
        for (int i =0;i<7;i++)
            for (int j =0;j<6;j++)
            addObject(new Block(), 50+80*i,20+30*j);
        Ball2 ball = new Ball2(players,this);
        addObject(ball,300,450);
    }
}
