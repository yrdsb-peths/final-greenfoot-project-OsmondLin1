import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gunman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gunman extends Actor
{
    GreenfootImage [] photos = new GreenfootImage[5];
    GreenfootImage [] photosleft = new GreenfootImage[5];
    SimpleTimer animTimer = new SimpleTimer();
    String facing = "right";
    
    public Gunman(){
        for(int i = 0; i < photos.length; i++){
            photos[i] = new GreenfootImage("images/player1_idle/tile00" + i + "-transformed.png");
            photos[i].scale(100, 100);
        } 
        
        for(int i = 0; i < photosleft.length; i++){
            photosleft[i] = new GreenfootImage("images/player1_idle/tile00" + i + "-transformed.png");
            photosleft[i].mirrorHorizontally();
            photosleft[i].scale(100, 100);
        }
        setImage(photos[0]);
        
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("")){
            move(10);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("a")){
            move(-10);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 10);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + 10);
        }
        
        animate();
    }
    
    int i = 0;
    public void animate(){
        
        if(animTimer.millisElapsed() > 100){
            if(facing.equals("right")){
                setImage(photos[i]);
                i = (i + 1) % photos.length;
            }
            else
            {
                setImage(photosleft[i]);
                i = (i + 1) % photosleft.length;
            }
            animTimer.mark();
        }
    }
}
