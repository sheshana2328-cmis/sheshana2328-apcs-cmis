import greenfoot.*;

public class Catz extends Player
   {
    GifImage Cat = new GifImage("Catz.gif");
    
    public Catz()
       {
        GreenfootImage image = getImage();
        image.scale(150,150);
        setImage(image);  
       } // end resize
  
    public void act() 
       {
        setImage(Cat.getCurrentImage());
        move();
        Over();
        Points();
       } // end  
    
} // end class