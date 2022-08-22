import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{

    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
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

        Level32 level32 = new Level32();
        addObject(level32,276,550);
        Level33 level33 = new Level33();
        addObject(level33,276,309);
        Level34 level34 = new Level34();
        addObject(level34,600,550);
        Level36 level36 = new Level36();
        addObject(level36,600,309);
    }
}
