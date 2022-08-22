import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level11 extends World
{

    /**
     * Constructor for objects of class Level11.
     * 
     */
    public Level11()
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
        Level11a level11a = new Level11a();
        addObject(level11a,265,492);
        Level11b level11b = new Level11b();
        addObject(level11b,515,492);
        Level11c level11c = new Level11c();
        addObject(level11c,765,492);
        Level11d level11d = new Level11d();
        addObject(level11d,1015,492);
    }
}
