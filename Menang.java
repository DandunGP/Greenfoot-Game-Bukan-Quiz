import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menang extends World
{

    /**
     * Constructor for objects of class Menang.
     * 
     */
    public Menang()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    public void act(){
        Greenfoot.playSound("LaguMenang.mp3");
        Greenfoot.delay(800);
        Greenfoot.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cartoon cartoon = new Cartoon();
        addObject(cartoon,1074,392);
    }
}
