import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx = 0;
    int dy = 5;
    int count = 0;
    int sum =0;
    int lev =1;
    public Player player;
    public World myWorld;
    public World gameover;
    public int timer = 1000;
    public Ball(Player player, World world)
    {
        myWorld = world;
        this.player = player;
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
        public void act() 
    {
         getWorld().showText("LEVEL: "+lev,100,525);
        moveAround();
        
        bounce();
        bounceoffEdge();
        hitBlock();
        youLose();
        youWin();
       
       
        if (Greenfoot.isKeyDown("space")){
            for(int i =0;i<=timer;i++){
            timer--;
          }
         if(timer==0){
            Greenfoot.setWorld(new World1());
        }
        
    }  
}
    public void moveAround()
    {
        setLocation(getX() + dx, getY() + dy);
    }
    public void bounce()
    {
        
        if(isTouching(Player.class) &&this.player.getX() > getX()+50)
        {
            dy = -dy;
            dx-=6;
        }
        else if(isTouching(Player.class) && this.player.getX() < getX() - 50)
        {
            dy = -dy;
            dx += 6;
        }
        
        else if(isTouching(Player.class) &&this.player.getX() > getX()+40)
        {
            dy = -dy;
            dx-=5;
        }
        else if(isTouching(Player.class) && this.player.getX() < getX() - 40)
        {
            dy = -dy;
            dx += 5;
        }
        
        else if(isTouching(Player.class) &&this.player.getX() > getX()+30)
        {
            dy = -dy;
            dx-=4;
        }
        else if(isTouching(Player.class) && this.player.getX() < getX() - 30)
        {
            dy = -dy;
            dx += 4;
        }
        else if(isTouching(Player.class) &&this.player.getX() > getX()+20)
        {
            dy = -dy;
            dx-=3;
        }
        else if(isTouching(Player.class) && this.player.getX() < getX() - 20)
        {
            dy = -dy;
            dx += 3;
        }
       else if(isTouching(Player.class) &&this.player.getX() > getX()+10)
        {
            dy = -dy;
            dx-=2;
        }
        else if(isTouching(Player.class) && this.player.getX() < getX() - 10)
        {
            dy = -dy;
            dx += 2;
        }
        else if (isTouching(Player.class) || isTouching(Block.class)){
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
            sum+=5;
        getWorld().showText("Score: "+sum,520,525);
        }
        else if(block!=null && block.getX() < getX() - 30)
        {
            getWorld().removeObject(block);
            dx = -dx;
            count++;
             sum+=5;
             getWorld().showText("Score: "+sum,520,525);
        }
        else if(block!=null)
        {
            getWorld().removeObject(block);
            count++;
             sum+=5;
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
        
        if (count == 28)
        {
            getWorld().showText("Press enter to next level ",getWorld().getWidth()/2,getWorld().getHeight()/2);
            if (Greenfoot.isKeyDown("enter"))
            {
                Greenfoot.setWorld(new level2());
            }
            else
            Greenfoot.stop();
        }
    }
   
    
}
