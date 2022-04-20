import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball2 extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx = 0;
    int dy = 7;
    int count = 0;
    int sum =140;
    int lev=2;
    public Player2 players;
    public World level2;
    public Ball2(Player2 players, World world)
    {
        level2 = world;
        this.players = players;
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
        public void act() 
    {
         getWorld().showText("LYGIS: "+lev,100,525);
        moveAround();
        bounce();
        bounceoffEdge();
        hitBlock();
        youLose();
        youWin();
        spacebar();
    }  
    public void moveAround()
    {
        setLocation(getX() + dx, getY() + dy);
    }
    public void bounce()
    {
        
               
        if(isTouching(Player2.class) &&this.players.getX() > getX()+40)
        {
            dy = -dy;
            dx-=5;
        }
        else if(isTouching(Player2.class) && this.players.getX() < getX() - 40)
        {
            dy = -dy;
            dx += 5;
        }
        
        else if(isTouching(Player2.class) &&this.players.getX() > getX()+30)
        {
            dy = -dy;
            dx-=4;
        }
        else if(isTouching(Player2.class) && this.players.getX() < getX() - 30)
        {
            dy = -dy;
            dx += 4;
        }
        else if(isTouching(Player2.class) &&this.players.getX() > getX()+20)
        {
            dy = -dy;
            dx-=3;
        }
        else if(isTouching(Player2.class) && this.players.getX() < getX() - 20)
        {
            dy = -dy;
            dx += 3;
        }
       else if(isTouching(Player2.class) &&this.players.getX() > getX()+10)
        {
            dy = -dy;
            dx-=2;
        }
        else if(isTouching(Player2.class) && this.players.getX() < getX() - 10)
        {
            dy = -dy;
            dx += 2;
        }
        else if (isTouching(Player2.class) || isTouching(Block.class)){
            dy= -dy;
             
        }
        
    }
    public void bounceoffEdge()
    {
        if (getX() >=getWorld().getWidth() - 1)
        {
            dx= -dx;
        }
        if (getX() <=0)
        {
            dx= -dx;
        }
        if (getY() <= 0)
        dy= -dy;
        if(getY() >=getWorld().getHeight() -1)
            dy= -dy;
    }
    public void hitBlock()
    {
        Actor block = getOneIntersectingObject(Block.class);
        if(block!=null && block.getX() > getX() + 30)
        {
            getWorld().removeObject(block);
            dx = -dx;
            count++;
            sum+=10;
        getWorld().showText("Score: "+sum,520,525);
        }
        else if(block!=null && block.getX() < getX() - 30)
        {
            getWorld().removeObject(block);
            dx = -dx;
            count++;
             sum+=10;
             getWorld().showText("Score: "+sum,520,525);
        }
        else if(block!=null)
        {
            getWorld().removeObject(block);
            count++;
             sum+=10;
             getWorld().showText("Score: "+sum,520,525);
        }
        
        
    }
    public void youLose()
    {
        if (getY() >= getWorld().getHeight() -1)
        {
            Greenfoot.setWorld(new gameover());
           
            Greenfoot.stop();
        }
    }
    public void youWin()
    {
        
        if (count == 42)
        {
            getWorld().showText("Press enter to next level",getWorld().getWidth()/2,getWorld().getHeight()/2);
            if (Greenfoot.isKeyDown("enter"))
            {
                Greenfoot.setWorld(new level3());
            }
            Greenfoot.stop();
        }
    }
    public void spacebar()
    {
        if (Greenfoot.isKeyDown("space")){
            Greenfoot.delay(10);
            Greenfoot.setWorld(new World1());    
        }
       
    }
}
