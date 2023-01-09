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
            photos[i].mirrorHorizontally();
            photos[i].scale(100, 100);
        } 
        
        for(int i = 0; i < photosleft.length; i++){
            photosleft[i] = new GreenfootImage("images/player1_idle/tile00" + i + "-transformed.png");
            
            photosleft[i].scale(100, 100);
        }
        setImage(photos[0]);
        
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("Right")){
            move(4);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("Left")){
            move(-4);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("Up")){
            setLocation(getX(), getY() - 4);
        }
        if(Greenfoot.isKeyDown("Down")){
            setLocation(getX(), getY() + 4);
        }
        
        if(getWorld().getObjects(GBullet.class).isEmpty()){
            if(getWorld().getObjects(GBulletleft.class).isEmpty()){
                if(Greenfoot.isKeyDown("shift")){
                    if(facing == "left"){
                        spawnGBullet();
                    }
                    else{
                        spawnGBulletleft();
                    }
                }
        
            }
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
    
    public void spawnGBullet(){
        MyWorld world = (MyWorld) getWorld();
        GBullet gbullet = new GBullet();
        int x = getX() - 9;
        int y = getY() - 34;
        world.addObject(gbullet, x, y);
    }
    
    public void spawnGBulletleft(){
        MyWorld world = (MyWorld) getWorld();
        GBulletleft gbulletleft = new GBulletleft();
        int x = getX() + 35;
        int y = getY() - 34;
        world.addObject(gbulletleft, x, y);
    }
}
