import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the greenfoot image of the bullet player 1 shoots to the right.
 * 
 * @Osmond Lin
 * @January 10, 2023
 */
public class TBullet extends Actor
{
    /**
     * This constructor creates a greenfoot image of a bullet that shoots right
     */
    public TBullet(){
        GreenfootImage tbullet = new GreenfootImage("images/TBullet.png");
        tbullet.scale(60, 60);
        setImage(tbullet);
        
    }
    
    /**
     * This method allows player 1's bullet to appear and travel right
     * When the bullet touches player 2, player 2 loses 1 life
     * When player 2's lives reach 0, player 1 wins and the gameover screen appears.
     */
    public void act()
    {
        int x = getX() + 25;
        int y = getY();
        setLocation(x, y);
        MyWorld world = (MyWorld) getWorld();
        int bottomX = getWorld().getWidth();
        if(getX() + 10 > bottomX) {
            world.removeObject(this);
        }
        else if(isTouching(Gunman.class)){
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
