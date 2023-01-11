import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the greenfoot image of the bullet player 2 shoots to the right.
 * 
 * @Osmond Lin
 * @January 10, 2023
 */
public class GBullet extends Actor
{
    /**
     * This constructor creates a greenfoot image of a bullet that shoots right
     */
    public GBullet(){
        GreenfootImage gbullet = new GreenfootImage("images/GBullet.png");
        gbullet.scale(50, 50);
        setImage(gbullet);
        
    }
    
    /**
     * This method allows player 2's bullet to appear and travel right
     * When the bullet touches player 1, player 1 loses 1 life
     * When player 1's lives reach 0, player 2 wins and the gameover screen appears.
     */
    public void act()
    {
        int x = getX() + 17;
        int y = getY();
        setLocation(x, y);
        MyWorld world = (MyWorld) getWorld();
        int bottomX = getWorld().getWidth();
        if(getX() + 10 > bottomX) {
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

