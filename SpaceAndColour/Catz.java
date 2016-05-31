import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catz extends Player
{
    GifImage Cat = new GifImage("catzgif.gif");
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(Cat.getCurrentImage());
        move();
    }    
    
    public void move()
        {
         if (Greenfoot.isKeyDown("a"))
            {
            turn(-2);
            }
         if (Greenfoot.isKeyDown("d"))
            {
            turn(2);
            }
         if(Greenfoot.isKeyDown("down"))
          {
           setLocation(getX(),getY()+3);
          }   
         if(Greenfoot.isKeyDown("up"))
          {
           setLocation(getX(),getY()-3);
          }   
        }//end
        
    
    
}