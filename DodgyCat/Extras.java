import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Extras extends Actor implements Drop 
   {
    public void act() 
       {
        drop();
       } // end
      
    public void drop()
       {
        setLocation(getX(),getY()+2);
       } // end     

   }
