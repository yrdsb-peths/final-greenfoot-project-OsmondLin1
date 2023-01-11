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
     * This constructor creates a greenfoot image of a bullet that shoots left
     */
    public GBulletleft(){
        GreenfootImage gbulletleft = new GreenfootImage("images/GBullet.png");
        gbulletleft.scale(50, 50);
        gbulletleft.mirrorHorizontally();
        setImage(gbulletleft);
        
    }
    
    /**
     * This method allows player 2's bullet to appear and travel left
     * When the bullet touches player 1, player 1 loses 1 life
     * When player 1's lives reach 0, player 2 wins and the gameover screen appears.
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