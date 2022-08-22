import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level12 extends World
{

    /**
     * Constructor for objects of class Level12.
     * 
     */
    public Level12()
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

        Level12a level12a = new Level12a();
        addObject(level12a,640,260);
        Level12b level12b = new Level12b();
        addObject(level12b,128,337);
        Level12c level12c = new Level12c();
        addObject(level12c,450,537);
        Level12d level12d = new Level12d();
        addObject(level12d,1004,448);
    }
}
