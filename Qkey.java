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
     * Act - do whatever the Qkey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Qkey(){
        GreenfootImage qkey = new GreenfootImage("images/q-key.png");
        qkey.scale(60, 60);
        setImage(qkey);
    }
    public void act()
    {
        // Add your action code here.
    }
}
