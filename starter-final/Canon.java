// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Canon extends Actor
{
    public static int Cooldown = -10;

    /**
     * Act - do whatever the Canon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        shootCannonBall();
    }

    /**
     * shoots cannon ball
     */
    public void shootCannonBall()
    {
        if (Cooldown <= 0) {
            CannonBall newBall =  new  CannonBall(Greenfoot.getRandomNumber(3) + 10);
            newBall.setRotation(getRotation());
            this.getWorld().addObject(newBall, this.getX(), this.getY());
            Cooldown = 120;
        }
        else {
            Cooldown = Cooldown - 1;
        }
    }
}
