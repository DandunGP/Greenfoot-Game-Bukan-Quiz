import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level7 extends World
{

    /**
     * Constructor for objects of class Level7.
     * 
     */
    public Level7()
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
        for(int i=0;i<1;i++){
            Apel apel = new Apel();
            addObject(apel,Greenfoot.getRandomNumber(getWidth()),
            Greenfoot.getRandomNumber(getWidth()));
        }
        
        for(int i=0;i<1;i++){
            Ular ular = new Ular();
            addObject(ular,Greenfoot.getRandomNumber(getWidth()),
            Greenfoot.getRandomNumber(getWidth()));
        }
        
        for(int i=0;i<1;i++){
            Semut semut = new Semut();
            addObject(semut,Greenfoot.getRandomNumber(getWidth()),
            Greenfoot.getRandomNumber(getWidth()));
        }
        
        for(int i=0;i<1;i++){
            Kumbang kumbang = new Kumbang();
            addObject(kumbang,Greenfoot.getRandomNumber(getWidth()),
            Greenfoot.getRandomNumber(getWidth()));
        }
        
        Perahu perahu = new Perahu();
        addObject(perahu,648,688);
        Apel apel = new Apel();
        addObject(apel,353,18);
        Kumbang kumbang = new Kumbang();
        addObject(kumbang,576,31);
        Semut semut = new Semut();
        addObject(semut,802,26);
        Ular ular = new Ular();
        addObject(ular,1020,27);
    }
}
