import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level11b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level11b extends Actor
{
    /**
     * Act - do whatever the Level11b wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new gameOver());
        }
    }    
}
