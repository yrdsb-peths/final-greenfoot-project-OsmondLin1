import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TBulletleft extends Actor
{
    /**
     * Act - do whatever the TBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TBulletleft(){
        GreenfootImage tbulletleft = new GreenfootImage("images/TBullet.png");
        tbulletleft.scale(60, 60);
        tbulletleft.mirrorHorizontally();
        setImage(tbulletleft);
        
    }
    
    public void act()
    {
        int x = getX() - 5;
        int y = getY();
        setLocation(x, y);
        MyWorld world = (MyWorld) getWorld();
        int bottomX = 10;
        if(getX()  < bottomX) {
            world.removeObject(this);
        } 
    }
}
