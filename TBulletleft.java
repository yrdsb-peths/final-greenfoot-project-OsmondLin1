import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the greenfoot image of the bullet player 2 shoots to the left.
 * 
 * @Osmond Lin
 * @January 10, 2023
 */
public class TBulletleft extends Actor
{
    /**
     * Act - do whatever the TBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TBulletleft(){
        GreenfootImage tbulletleft = new GreenfootImage("images/TBullet.png");
        tbulletleft.scale(60, 60);
        tbulletleft.mirrorHorizontally();
        setImage(tbulletleft);
        
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
        } else if(isTouching(Gunman.class)){
            world.removeObject(this);
            world.decreaseGlives();
        }
        if(world.glives < 1)
        {
            GameOver over = new GameOver();
            Greenfoot.setWorld(over);
            over.gameOvert();
        }
    }
}

