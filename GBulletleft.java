import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the greenfoot image of the bullet player 2 shoots to the left.
 * 
 * @Osmond Lin
 * @January 10, 2023
 */
public class GBulletleft extends Actor
{
    /**
     * Act - do whatever the TBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GBulletleft(){
        GreenfootImage gbulletleft = new GreenfootImage("images/GBullet.png");
        gbulletleft.scale(50, 50);
        gbulletleft.mirrorHorizontally();
        setImage(gbulletleft);
        
    }
    
    public void act()
    {
        int x = getX() - 17;
        int y = getY();
        setLocation(x, y);
        MyWorld world = (MyWorld) getWorld();
        int bottomX = 10;
        if(getX()  < bottomX) {
            world.removeObject(this);
        }
        else if(isTouching(Tryhard.class)){
            world.removeObject(this);
            world.decreaseTlives();
        }
        if(world.tlives < 1)
        {
            GameOver over = new GameOver();
            Greenfoot.setWorld(over);
            over.gameOverg();
        }
    }
}