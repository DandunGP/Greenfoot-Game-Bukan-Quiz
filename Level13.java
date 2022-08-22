import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level13 extends World
{

    /**
     * Constructor for objects of class Level13.
     * 
     */
    public Level13()
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
        Him him = new Him();
        addObject(him,586,519);
        him.setLocation(586,519);
        Her her = new Her();
        addObject(her,640,535);
        her.setLocation(640,535);
        Her2 her2 = new Her2();
        addObject(her2,780,576);
    }
}
