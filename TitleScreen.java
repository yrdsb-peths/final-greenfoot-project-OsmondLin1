import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the titlescreen, where the intructions are displayed.
 * 
 * @Osmond Lin 
 * @January 10, 2023
 */
public class TitleScreen extends World
{

    GreenfootSound sound = new GreenfootSound("sounds/battlemusic.mp3");
    
    /**
     * This is the constructor for the titlescreen
     * The name of the game, "Raging Battlestation", is displayed in the center
     * Labels and images are used to help the players understand how the game works.
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1);
        
        Label titleLabel = new Label("Raging Battlestation", 85);
        titleLabel.setFillColor(Color.RED);
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        
        Label spaceLabel = new Label("Press SPACE to Start", 30);

        addObject(spaceLabel, getWidth()/2, 350);
        prepare();
        
        Label playerone = new Label("Player 1" , 30);
        addObject(playerone, 110, 320);
        
        Label playertwo = new Label("Player 2" , 30);
        addObject(playertwo, 880, 320);
        
        Label instruction = new Label("Defeat your opponent before they defeat you!", 35);
        addObject(instruction, getWidth()/2, 200);
    }
    
    /**
     * This method sets the world to the main battle screen when the space bar is pressed
     * Battle music will start playing
     */
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
            
        }
        sound.play();
        
    }
    
    /**
     * This method sets the images in the titlescreen.
     */
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
        Qkey qkey = new Qkey();
        addObject(qkey, 115, 435);
        Shift shift = new Shift();
        addObject(shift, 885, 440);
    }
}
