import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the image of the shift key that appears in the titlescreen.
 * 
 * @Osmond Lin
 * @January 10, 2023
 */
public class Shift extends Actor
{
    /**
     * Act - do whatever the Shift wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Shift(){
        GreenfootImage shift = new GreenfootImage("images/30836.png");
        shift.scale(100,60);
        setImage(shift);
    }
    public void act()
    {
        // Add your action code here.
    }
}
