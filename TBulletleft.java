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
     * This constructor creates a greenfoot image of a bullet that shoots left
     */
    public TBulletleft(){
        GreenfootImage tbulletleft = new GreenfootImage("images/TBullet.png");
        tbulletleft.scale(60, 60);
        tbulletleft.mirrorHorizontally();
        setImage(tbulletleft);
        
    }
    
    /**
     * This method allows player 1's bullet to appear and travel left
     * When the bullet touches player 2, player 2 loses 1 life
     * When player 2's lives reach 0, player 1 wins and the gameover screen appears.
     */
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

