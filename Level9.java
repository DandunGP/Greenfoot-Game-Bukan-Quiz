import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level9 extends World
{

    /**
     * Constructor for objects of class Level9.
     * 
     */
    public Level9()
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
        Level9true level9true = new Level9true();
        addObject(level9true,170,31);
        Level9a level9a = new Level9a();
        addObject(level9a,525,490);
        Level9b level9b = new Level9b();
        addObject(level9b,525,630);
        Level9c level9c = new Level9c();
        addObject(level9c,755,490);
        Level9d level9d = new Level9d();
        addObject(level9d,755,630);
    }
}
