import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cartoon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cartoon extends Actor
{
    private int speed2 = 4;
    private int leftTurn2 = 700;
    private int rightTurn2 = 1200;
    private int down = 500;
    private int up = 300;
    
    /**
     * Act - do whatever the Cartoon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        setLocation (getX() + speed2, getY() + speed2 );
        
        if (atTurningPoint2()){
            speed2 = -speed2;
        }
        
        if (atTurningPoint3()){
            speed2 = -speed2;
        }
    }
    
    public boolean atTurningPoint2()
    {
        return (getX() <= leftTurn2 || getX() >= rightTurn2);
    }
    
    public boolean atTurningPoint3(){
        return (getY() <= down || getY() >= up );
    }
}
