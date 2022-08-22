import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Perahu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perahu extends Actor
{
    /**
     * Act - do whatever the Perahu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            moveRight();
        }
        if(Greenfoot.isKeyDown("left")){
            moveLeft();
        }
    }
    
    public void moveRight(){
        setLocation(getX()+10, getY());
    }
    
    public void moveLeft(){
        setLocation(getX()-10, getY());
    }
}
