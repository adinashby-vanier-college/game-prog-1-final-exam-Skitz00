// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{
    private int speed;

    /**
     * defines speed
     */
    public CannonBall(int speed)
    {
        this.speed = speed;
    }

    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        kill();
        move(speed);
        if (this.isAtEdge()) {
            this.getWorld().removeObject(this);
        }
        if (isGameLost()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * kills ladybug when touched
     */
    public void kill()
    {
        Actor ladybug = getOneIntersectingObject(Ladybug.class);
        if (ladybug != null) {
            World world = getWorld();
            world.removeObject(ladybug);
        }
    }

    /**
     * boolean to see if game is lost
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * transitions to game over world
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOver();
        Greenfoot.setWorld(gameOverWorld);
        Greenfoot.playSound("losing.wav");
    }
}
