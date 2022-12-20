import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1);
        Label titleLabel = new Label("Raging Battlestation", 80);
        titleLabel.setFillColor(Color.RED);
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        
        Label spaceLabel = new Label("Press SPACE to Start", 30);

        addObject(spaceLabel, getWidth()/2, 350);
        prepare();
        
        Label playerone = new Label("Player 1" , 30);
        addObject(playerone, 110, 320);
        
        Label playertwo = new Label("Player 2" , 30);
        addObject(playertwo, 880, 320);
        
        
    }

    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
            
        }
        
    }
    private void prepare()
    {
        Tryhard tryhard = new Tryhard();
        addObject(tryhard, 125, 250);
        Gunman gunman = new Gunman();
        addObject(gunman, 885, 250);
        WASD wasd = new WASD();
        addObject(wasd, 115, 375);
        Arrow arrow = new Arrow();
        addObject(arrow, 885, 375);
    }
}
