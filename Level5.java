import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends World
{

    /**
     * Constructor for objects of class Level5.
     * 
     */
    public Level5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Level5a level5a = new Level5a();
        addObject(level5a,390,220);
        Level5b level5b = new Level5b();
        addObject(level5b,390,455);
        Level5c level5c = new Level5c();
        addObject(level5c,890,220);
        Level5d level5d = new Level5d();
        addObject(level5d,890,455);
    }
}
