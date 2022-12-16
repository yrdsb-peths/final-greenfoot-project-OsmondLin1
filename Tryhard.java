import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tryhard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tryhard extends Actor
{
    GreenfootImage [] images = new GreenfootImage[4];
    GreenfootImage [] imagesleft = new GreenfootImage[4];
    
    public Tryhard(){
        for(int i = 0; i < images.length; i++){
            images[i] = new GreenfootImage("images/player2_idle/tile00" + i + "-f7yw8xJvF-transformed.png");
            images[i].scale(100, 100);
        } 
        
        for(int i = 0; i < imagesleft.length; i++){
            imagesleft[i] = new GreenfootImage("images/player2_idle/tile00" + i + "-f7yw8xJvF-transformed.png");
            imagesleft[i].mirrorHorizontally();
            imagesleft[i].scale(100, 100);
        }
        setImage(images[0]);
    }
    public void act()
    {
        
    }
}
