import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the qKey image that appears in the titlescreen.
 * 
 * @Osmond Lin 
 * @January 10, 2023
 */
public class Qkey extends Actor
{
    /**
     * This is the constructor for the qKey image.
     */
    public Qkey(){
        GreenfootImage qkey = new GreenfootImage("images/q-key.png");
        qkey.scale(60, 60);
        setImage(qkey);
    }
}
