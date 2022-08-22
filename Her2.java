import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Her2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Her2 extends Actor
{
    /**
     * Act - do whatever the Her2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 6;
    private int leftTurn = 440;
    private int rightTurn = 940;
    
    public Her2(){
        GreenfootImage myImage=getImage();
        int myNewHeight = (int)myImage.getHeight()*3;
        int myNewWidth = (int)myImage.getWidth()*3;
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
