import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
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
        Katak katak = new Katak();
        addObject(katak,200,535);
        Lalat lalat = new Lalat();
        addObject(lalat,645,156);
    }
    
    private void Hilang(){
        addObject(new Lalat(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }

    public boolean Muncul(){
        return getObjects(Lalat.class) .size() == 0;
    }
    
    public void act(){
        if(Muncul()){
            Hilang();
        }
    }
}
