import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5d extends Actor
{
    /**
     * Act - do whatever the Level5d wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new gameOver());
        }
        
        if (Greenfoot.mousePressed(this))
        {getImage().scale((int)Math.round(getImage().getWidth()*0.8),(int)Math.round(getImage().getHeight()*0.8));
        }
    }    
}
