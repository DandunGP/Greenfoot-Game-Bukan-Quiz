import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kumbang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kumbang extends Level3game
{
    /**
     * Act - do whatever the Kumbang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 6);
        kumbangKembali();
        
        if(isTouching(Perahu.class)){
            Greenfoot.setWorld(new gameOver());
        }
    }
    
    public void kumbangKembali(){
        if (getY() >= getWorld().getHeight()-10){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        }
    }    
}
