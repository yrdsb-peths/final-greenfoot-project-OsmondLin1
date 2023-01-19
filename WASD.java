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
     * This is the constructor for the WASD image.
     */
    public WASD(){
        GreenfootImage wasd = new GreenfootImage("images/wasd.png");
        wasd.scale(100, 100);
        setImage(wasd);
    }
}
