import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
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
        Level115 level115 = new Level115();
        addObject(level115,185,227);
        Level117 level117 = new Level117();
        addObject(level117,1098,467);
        Level121 level121 = new Level121();
        addObject(level121,1098,227);
        Level127 level127 = new Level127();
        addObject(level127,185,467);
    }
}
