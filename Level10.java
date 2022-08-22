import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level10 extends World
{

    /**
     * Constructor for objects of class Level10.
     * 
     */
    public Level10()
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
        Level10a level10a = new Level10a();
        addObject(level10a,460,480);
        Level10b level10b = new Level10b();
        addObject(level10b,460, 640);
        Level10c level10c = new Level10c();
        addObject(level10c,820,480);
        Level10d level10d = new Level10d();
        addObject(level10d,820,640);
    }
}
