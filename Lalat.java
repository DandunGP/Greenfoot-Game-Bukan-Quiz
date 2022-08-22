import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lalat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lalat extends Actor
{
    int Terbang = 150;
    /**
     * Act - do whatever the Lalat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Katak.class)){
            Greenfoot.setWorld(new Level4());
        }
        
        Terbang--;
        if (Terbang == 0){
            getWorld().removeObject(this);
        }
    }    
}
