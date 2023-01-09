import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GBullet extends Actor
{
    /**
     * Act - do whatever the TBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GBullet(){
        GreenfootImage gbullet = new GreenfootImage("images/GBullet.png");
        gbullet.scale(50, 50);
        setImage(gbullet);
        
    }
    
    public void act()
    {
        int x = getX() + 12;
        int y = getY();
        setLocation(x, y);
        MyWorld world = (MyWorld) getWorld();
        int bottomX = getWorld().getWidth();
        if(getX() + 10 > bottomX) {
            world.removeObject(this);
        } 
        else if(isTouching(Tryhard.class)){
            world.removeObject(this);
            world.decreaseTlives();
        }
        if(world.tlives < 1)
        {
            world.gameOverg();
        }
    }
}

