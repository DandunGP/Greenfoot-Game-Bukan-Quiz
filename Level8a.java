import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level8a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level8a extends Actor
{
    /**
     * Act - do whatever the Level8a wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("Button.mp3");
            Greenfoot.setWorld(new Level9());
            }
        
        if (Greenfoot.mousePressed(this))
        {getImage().scale((int)Math.round(getImage().getWidth()*0.8),(int)Math.round(getImage().getHeight()*0.8));
        }
    }    
}
