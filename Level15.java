import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level15 extends World
{

    /**
     * Constructor for objects of class Level15.
     * 
     */
    public Level15()
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
        Level15a level15a = new Level15a();
        addObject(level15a,781,515);
        Level15b level15b = new Level15b();
        addObject(level15b,498,515);
        Level15c level15c = new Level15c();
        addObject(level15c,215,515);
        Level15d level15d = new Level15d();
        addObject(level15d,1065,515);
    }
}
