import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Background extends Actor implements BackgroundMove
   {    
    public abstract void act();
       
    public void BackgroundMove()
       {
        setLocation(getX(),getY()+1);
        if (isAtEdge())
           {
            setLocation(getX(),0);
           }    
       } // end
   } // end class
