import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        super(1000, 500, 1); 
    }
    
    public void gameOvert(){
        Label gameOverLabelt = new Label("PLAYER 1 WINS!", 120);
        gameOverLabelt.setFillColor(Color.RED);
        addObject(gameOverLabelt, getWidth()/2, getHeight()/2);
    }
    
    public void gameOverg(){
        Label gameOverLabelg = new Label("PLAYER 2 WINS!", 120);
        gameOverLabelg.setFillColor(Color.RED);
        addObject(gameOverLabelg, getWidth()/2, getHeight()/2);
    }
}
