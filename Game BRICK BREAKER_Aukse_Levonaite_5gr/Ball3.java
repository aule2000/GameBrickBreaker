import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball3 extends Actor
{
    /**
     * Act - do whatever the Ball3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx = 0;
    int dy = 8;
    int count = 0;
    int sum =560;
    int lev =3;
    public Player3 player1;
    public World level3;
    public Ball3(Player3 player1, World world)
    {
        level3 = world;
        this.player1 = player1;
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
        if(isTouching(Player3.class) &&this.player1.getX() > getX()+40)
        {
            dy = -dy;
            dx-=5;
        }
        else if(isTouching(Player3.class) && this.player1.getX() < getX() - 40)
        {
            dy = -dy;
            dx += 5;
        }
        
        
        else if(isTouching(Player3.class) &&this.player1.getX() > getX()+30)
        {
            dy = -dy;
            dx-=4;
        }
        else if(isTouching(Player3.class) && this.player1.getX() < getX() - 30)
        {
            dy = -dy;
            dx += 4;
        }
        else if(isTouching(Player3.class) &&this.player1.getX() > getX()+20)
        {
            dy = -dy;
            dx-=3;
        }
        else if(isTouching(Player3.class) && this.player1.getX() < getX() - 20)
        {
            dy = -dy;
            dx += 3;
        }
       else if(isTouching(Player3.class) &&this.player1.getX() > getX()+10)
        {
            dy = -dy;
            dx-=2;
        }
        else if(isTouching(Player3.class) && this.player1.getX() < getX() - 10)
        {
            dy = -dy;
            dx += 2;
        }
        else if (isTouching(Player3.class) || isTouching(Block.class)){
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
            sum+=15;
        getWorld().showText("Score: "+sum,520,525);
        }
        else if(block!=null && block.getX() < getX() - 30)
        {
            getWorld().removeObject(block);
            dx = -dx;
            count++;
             sum+=15;
             getWorld().showText("Score: "+sum,520,525);
        }
        else if(block!=null)
        {
            getWorld().removeObject(block);
            count++;
             sum+=15;
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
        
        if (count == 63)
        {
            Greenfoot.setWorld(new youwin());
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
