import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player extends Actor
{
    
    public void act()
    {
        Buttons();
    }    
    
    public void Buttons()
      {
       if(Greenfoot.isKeyDown("Space"))
          {
           setLocation(getX(),getY()-3);
          }     
      }
      
}
