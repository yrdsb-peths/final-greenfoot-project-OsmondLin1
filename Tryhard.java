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
    SimpleTimer animTimer = new SimpleTimer();
    String facing = "right";
    public Tryhard(){
        for(int i = 0; i < images.length; i++){
            images[i] = new GreenfootImage("images/player2_idle/tile00" + i + ".png");
            images[i].scale(100, 100);
        } 
        
        for(int i = 0; i < imagesleft.length; i++){
            imagesleft[i] = new GreenfootImage("images/player2_idle/tile00" + i + ".png");
            imagesleft[i].mirrorHorizontally();
            imagesleft[i].scale(100, 100);
        }
        setImage(images[0]);
        
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("d")){
            move(6);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("a")){
            move(-6);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 6);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + 6);
        }
        if(getWorld().getObjects(TBullet.class).isEmpty()){
            if(getWorld().getObjects(TBulletleft.class).isEmpty()){
                if(Greenfoot.isKeyDown("q")){
                    if(facing == "left"){
                        spawnTBulletleft();
                    }
                    else{
                        spawnTBullet();
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
                setImage(images[i]);
                i = (i + 1) % images.length;
            }
            else
            {
                setImage(imagesleft[i]);
                i = (i + 1) % imagesleft.length;
            }
            animTimer.mark();
        }
        
        
    }
    
    public void spawnTBullet(){
        MyWorld world = (MyWorld) getWorld();
        TBullet tbullet = new TBullet();
        int x = getX() + 20;
        int y = getY() -13;
        world.addObject(tbullet, x, y);
    }
    
    public void spawnTBulletleft(){
        MyWorld world = (MyWorld) getWorld();
        TBulletleft tbulletleft = new TBulletleft();
        int x = getX() + 20;
        int y = getY() -13;
        world.addObject(tbulletleft, x, y);
    }
    
    
}
