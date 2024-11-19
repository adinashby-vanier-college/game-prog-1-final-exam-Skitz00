// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWon extends World
{

    /**
     * Constructor for objects of class GameWon.
     */
    public GameWon()
    {
        super(800, 600, 1);
        showTextWithBigWhiteFont("Congratulations! You Win!", 100, 300);
    }

    /**
     * shows text on screen
     */
    public void showTextWithBigWhiteFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
}
