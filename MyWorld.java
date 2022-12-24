import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int tlives = 3;
    public Label tryhardlives;
    public int glives = 3;
    public Label gunmanlives;
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
    
    public void decreaseTlives(){
        tlives--;
        tryhardlives.setValue("Player 1 Lives:" + tlives);
    }
    
    public void decreaseGlives(){
        glives--;
        gunmanlives.setValue("Player 2 Lives:" + glives);
    }
    
    public void gameOvert(){
        Label gameOverLabelt = new Label("PLAYER 1 WINS!", 120);
        addObject(gameOverLabelt, getWidth()/2, getHeight()/2);
    }
    
    public void gameOverg(){
        Label gameOverLabelg = new Label("PLAYER 2 WINS!", 120);
        addObject(gameOverLabelg, getWidth()/2, getHeight()/2);
    }

    
    
}
