import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Her here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Her extends Actor
{
    private int speed = 4;
    private int leftTurn = 480;
    private int rightTurn = 890;
    
    /**
     * Act - do whatever the Her wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Her(){
        GreenfootImage myImage=getImage();
        int myNewHeight = (int)myImage.getHeight()*2;
        int myNewWidth = (int)myImage.getWidth()*2;
        myImage.scale(myNewWidth, myNewHeight);
        }
    
    public void act() 
    {
        setLocation (getX() + speed, getY() );
        
        if (atTurningPoint()){
            speed = -speed;
        }
        
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Level14());
        }
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new gameOver());
        }
    }
    
    public boolean atTurningPoint()
    {
        return (getX() <=leftTurn || getX() >= rightTurn);
    }
}
