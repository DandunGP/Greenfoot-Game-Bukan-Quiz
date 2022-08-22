import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level8 extends World
{

    /**
     * Constructor for objects of class Level8.
     * 
     */
    public Level8()
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
        Level8a level8a = new Level8a();
        addObject(level8a,250,522);
        Level8b level8b = new Level8b();
        addObject(level8b,1030,522);
        Level8c level8c = new Level8c();
        addObject(level8c,510,522);
        Level8d level8d = new Level8d();
        addObject(level8d,770,522);
    }
}
