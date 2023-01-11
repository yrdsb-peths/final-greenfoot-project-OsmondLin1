import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the class of player 1.
 * 
 * @Osmond Lin
 * @January 10, 2023
 */
public class Tryhard extends Actor
{
    GreenfootImage [] images = new GreenfootImage[4];
    GreenfootImage [] imagesleft = new GreenfootImage[4];
    SimpleTimer animTimer = new SimpleTimer();
    String facing = "right";
    
    /**
     * This constructor creates an animation of player 2 facing left as default.
     */
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
    
    /**
     * This method allows player 1 to move up, down, left, right
     * It also allows player 1 to shoot a bullet left or right, depending on the direction
     * Player 1 will only be able to have one bullet present in MyWorld
     * The bullet disappears when it reaches the end of the screen or hits player 2.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("d")){
            move(4);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("a")){
            move(-4);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 4);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + 4);
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
    /**
     * This is the method that animates player 1.
     */
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
    
    /**
     * This method spawns a bullet from where player 1 is standing and travels to the right.
     */
    public void spawnTBullet(){
        MyWorld world = (MyWorld) getWorld();
        TBullet tbullet = new TBullet();
        int x = getX() + 20;
        int y = getY() -13;
        world.addObject(tbullet, x, y);
    }
    
    /**
     * This method spawns a bullet from where player 1 is standing and travels to the right.
     */
    public void spawnTBulletleft(){
        MyWorld world = (MyWorld) getWorld();
        TBulletleft tbulletleft = new TBulletleft();
        int x = getX() + 20;
        int y = getY() -13;
        world.addObject(tbulletleft, x, y);
    }
    
    
}
