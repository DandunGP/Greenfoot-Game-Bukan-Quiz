import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Him here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Him extends Actor
{   
    private int speed = 2;
    private int leftTurn = 586;
    private int rightTurn = 740;
    
    /**
     * Act - do whatever the Him wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        setLocation (getX() + speed, getY() );
        
        if (atTurningPoint()){
            speed = -speed;
        }
        
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Level14());
        }
    }

    public boolean atTurningPoint()
    {
        return (getX() <=leftTurn || getX() >= rightTurn);
    }   
}
