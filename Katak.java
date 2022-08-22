import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Katak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Katak extends Actor
{
    /**
     * Act - do whatever the Katak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
            move(8);
        }
        if(Greenfoot.isKeyDown("down")){
            move(-8);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(4);
        }
        if(Greenfoot.isKeyDown("left")){
            turn(-4);
        }
    }    
}
