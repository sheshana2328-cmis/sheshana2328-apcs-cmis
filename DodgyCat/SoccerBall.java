import greenfoot.*;  
import java.util.Random; 

public class SoccerBall extends Objects
   {
    public SoccerBall()
       {
        GreenfootImage image = getImage();
        image.scale(90,90);
        setImage(image);  
       } // end resize
        
    public void act() 
       {
        drop();
        Reappear();
       } // end 
       
    public void Reappear()
       {
        if (isAtEdge()) 
           {
            ObjectsAppear();
            
            Random generator = new Random();  
            Actor spawn = (Actor)Objects.get(generator.nextInt(Objects.size()));
            getWorld().addObject(spawn, Greenfoot.getRandomNumber(getWorld().getWidth()), getWorld().getHeight() - 400);
            
            getWorld().removeObject(this);
            
           }    
       } // end 
    
   } // end class
