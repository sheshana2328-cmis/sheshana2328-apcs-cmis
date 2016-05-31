import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is just an example. You can delete it or change the code.
 * It's not necessary for the scrolling system.
 */
public class ExampleScrollingActor extends ScrollingActor
{
    
    public ExampleScrollingActor() {
        
    }
    
    /**
     * Here you can tell your actor what he has to do.
     */
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            setLocation(getX(), getY() - 3);
        }
        else {
            setLocation(getX(), getY() + 2);
        }
        
    }
}
