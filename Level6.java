import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level6 extends World
{

    /**
     * Constructor for objects of class Level6.
     * 
     */
    public Level6()
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
        Level62 level62 = new Level62();
        addObject(level62,464,330);
        Level63 level63 = new Level63();
        addObject(level63,818,330);
        Level64 level64 = new Level64();
        addObject(level64,818,472);
        Level66 level66 = new Level66();
        addObject(level66,464,472);
    }
}
