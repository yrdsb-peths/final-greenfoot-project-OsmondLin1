import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the greenfoot image of WASD that appears in the titlescreen.
 * 
 * @Osmond Lin
 * @January 10, 2023
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
