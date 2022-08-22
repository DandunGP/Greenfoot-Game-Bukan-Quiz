import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ular extends Level3game
{
    /**
     * Act - do whatever the Ular wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 6);
        ularKembali();
        
        if(isTouching(Perahu.class)){
            Greenfoot.setWorld(new gameOver());
        }
    }
    
    public void ularKembali(){
        if (getY() >= getWorld().getHeight()-10){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        }
    }    
}
