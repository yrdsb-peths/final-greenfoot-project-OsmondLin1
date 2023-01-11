import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the main battlefield screen where the players battle.
 * 
 * @Osmond Lin
 * @January 10, 2023
 */
public class MyWorld extends World
{
    public int tlives = 6;
    public Label tryhardlives;
    public int glives = 6;
    public Label gunmanlives;
    
    /**
     * This is the constructor for the main screen where player 1 and player 2 battle each other
     * Player 1 starts on the left of the screen while facing right
     * Player 2 starts on the right of the screen while facing left
     * The top left displays player 1's lives
     * The top right displays player 2's lives.
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 500, 1);
        Tryhard tryhard = new Tryhard();
        addObject(tryhard, 200, 200);
        Gunman gunman = new Gunman();
        addObject(gunman, 900, 200);
        
        tryhardlives = new Label("Player 1 Lives:" + tlives, 40);
        addObject(tryhardlives, 125, 25);
        
        gunmanlives = new Label("Player 2 Lives:" + glives, 40);
        addObject(gunmanlives, 975, 25);
        
        
    }
    
    /**
     * This method takes a life from player 1.
     */
    public void decreaseTlives(){
        tlives--;
        tryhardlives.setValue("Player 1 Lives:" + tlives);
    }
    
    /**
     * This method takes a life from player 2.
     */
    public void decreaseGlives(){
        glives--;
        gunmanlives.setValue("Player 2 Lives:" + glives);
    }
    
    
}
