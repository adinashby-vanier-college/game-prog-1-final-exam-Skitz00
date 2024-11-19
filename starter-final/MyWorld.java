import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Canon canon = new Canon();
        addObject(canon,53,193);
        Canon canon2 = new Canon();
        addObject(canon2,44,436);
        Canon canon3 = new Canon();
        addObject(canon3,377,40);
        Canon canon4 = new Canon();
        addObject(canon4,698,313);
        canon2.setLocation(197,395);
        canon4.setLocation(708,335);
        canon4.setRotation(180);
        canon.setLocation(42,167);
        canon2.setLocation(176,424);
        Canon canon5 = new Canon();
        addObject(canon5,716,547);
        canon5.setRotation(180);
        canon3.setLocation(410,35);
        canon3.setRotation(90);
        Ladybug ladybug = new Ladybug();
        ladybug.setRotation(180);
        addObject(ladybug,698,62);
        FinishLocation finishLocation = new FinishLocation();
        addObject(finishLocation,62,419);
    }
}
