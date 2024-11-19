// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        playerWin();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * the method that deals with moving
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    }

    /**
     * 
     */
    public void playerWin()
    {
        Actor finish = getOneIntersectingObject(FinishLocation.class);
        if (finish != null) {
            World world = getWorld();
            world.removeObject(finish);
        }
    }

    /**
     * 
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWon();
        Greenfoot.setWorld(gameWonWorld);
        Greenfoot.playSound("win.wav");
    }
}
