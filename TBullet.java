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
        // Add your action code here.
    }
}
