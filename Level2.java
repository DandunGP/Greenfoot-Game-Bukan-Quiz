import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
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
        Level2G level2G = new Level2G();
        addObject(level2G,200,524);
        Level2T level2T = new Level2T();
        addObject(level2T,492,524);
        Level2I level2I = new Level2I();
        addObject(level2I,784,524);
        Level2U level2U = new Level2U();
        addObject(level2U,1076,524);
    }
}
