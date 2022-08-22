import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level14 extends World
{

    /**
     * Constructor for objects of class Level14.
     * 
     */
    public Level14()
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
        Level14a level14a = new Level14a();
        addObject(level14a,408,384);
        Level14b level14b = new Level14b();
        addObject(level14b,408,540);
        Level14c level14c = new Level14c();
        addObject(level14c,835,384);
        Level14d level14d = new Level14d();
        addObject(level14d,835,540);
    }
}
