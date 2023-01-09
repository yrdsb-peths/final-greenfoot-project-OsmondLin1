import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TBullet extends Actor
{
    /**
     * Act - do whatever the TBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TBullet(){
        GreenfootImage tbullet = new GreenfootImage("images/TBullet.png");
        tbullet.scale(60, 60);
        setImage(tbullet);
        
    }
    
    public void act()
    {
        int x = getX() + 20;
        int y = getY();
        setLocation(x, y);
        MyWorld world = (MyWorld) getWorld();
        int bottomX = getWorld().getWidth();
        if(getX() + 10 > bottomX) {
            world.removeObject(this);
        }
        else if(isTouching(Gunman.class)){
            world.removeObject(this);
            world.decreaseGlives();
        }
        if(world.glives < 1)
        {
            world.gameOvert();
        }
    }
}
