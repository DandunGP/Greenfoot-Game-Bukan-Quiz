import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Semut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Semut extends Level3game
{
    /**
     * Act - do whatever the Semut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 6);
        semutKembali();
        
        if(isTouching(Perahu.class)){
            Greenfoot.setWorld(new gameOver());
        }
    }
    
    public void semutKembali(){
        if (getY() >= getWorld().getHeight()-10){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        }
    }    
}
