import greenfoot.*;  

public class Mushroom extends Extras
   {      
    int counter = 0;
    
    public Mushroom()
       {
        GreenfootImage image = getImage();
        image.scale(40,40);
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
            getWorld().addObject(new Mushroom(), Greenfoot.getRandomNumber(getWorld().getWidth()), getWorld().getHeight() - 400);            
            getWorld().removeObject(this);
           }    
       } // end 
       

   } // end
