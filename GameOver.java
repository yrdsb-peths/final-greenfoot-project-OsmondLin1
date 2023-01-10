import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the screen that appears when one player wins. The victor will appear a label.
 * 
 * @Osmond Lin
 * @January 10, 2023
 */
public class GameOver extends World
{
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
