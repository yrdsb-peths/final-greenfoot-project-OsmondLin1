import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the greenfoot image of arrow keys that is displayed in the titlescreen.
 * 
 * @Osmond Lin
 * @January 10, 2023
 */
public class Arrow extends Actor
{
    /**
     * This is the constructor for the arrow keys image.
     */
    public Arrow(){
        GreenfootImage arrow = new GreenfootImage("images/Arrow_keys.svg.png");
        arrow.scale(115, 72);
        setImage(arrow);
    }
    public void act()
    {
        // Add your action code here.
    }
}
