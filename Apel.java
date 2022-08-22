import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apel extends Level3game
{
    /**
     * Act - do whatever the Apel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 6);
        apelKembali();
        
        if(isTouching(Perahu.class)){
            Greenfoot.setWorld(new Level8());
        }
    }
    
    public void apelKembali(){
        if (getY() >= getWorld().getHeight()-10){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        }
    }
}