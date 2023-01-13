import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the class of player 2.
 * 
 * @Osmond Lin 
 * @January 10, 2023
 */
public class Gunman extends Actor
{
    GreenfootImage [] photos = new GreenfootImage[5];
    GreenfootImage [] photosleft = new GreenfootImage[5];
    SimpleTimer animTimer = new SimpleTimer();
    String facing = "right";
    GreenfootSound bullet = new GreenfootSound("sounds/gunshot.mp3");
    
    /*
     * This constructor creates an animation of player 1 facing right as default.
     */
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
    
    /**
     * This method allows player 2 to move up, down, left, right
     * It also allows player 2 to shoot a bullet left or right, depending on the direction
     * Player 2 will only be able to have one bullet present in MyWorld
     * The bullet disappears when it reaches the end of the screen or hits player 1.
     */
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
                        bullet.play();
                    }
                    else{
                        spawnGBulletleft();
                        bullet.play();
                    }
                }
        
            }
        }  
        
        animate();
    }
    
    int i = 0;
    /**
     * This is the method that animates player 2.
     */
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
    
    /**
     * This method spawns a bullet from where player 2 is standing and travels to the right.
     */
    public void spawnGBullet(){
        MyWorld world = (MyWorld) getWorld();
        GBullet gbullet = new GBullet();
        int x = getX() - 9;
        int y = getY() - 34;
        world.addObject(gbullet, x, y);
    }
    
    /**
     * This method spawns a bullet from where player 2 is standing and travels to the left.
     */
    public void spawnGBulletleft(){
        MyWorld world = (MyWorld) getWorld();
        GBulletleft gbulletleft = new GBulletleft();
        int x = getX() + 35;
        int y = getY() - 34;
        world.addObject(gbulletleft, x, y);
    }
}
