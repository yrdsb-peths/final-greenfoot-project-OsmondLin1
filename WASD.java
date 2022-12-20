import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WASD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WASD extends Actor
{
    /**
     * Act - do whatever the WASD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WASD(){
        GreenfootImage wasd = new GreenfootImage("images/wasd.png");
        wasd.scale(100, 100);
        setImage(wasd);
    }
    public void act()
    {
        // Add your action code here.
    }
}
