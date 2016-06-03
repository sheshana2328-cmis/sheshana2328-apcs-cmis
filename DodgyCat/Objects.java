import greenfoot.*;  
import java.util.ArrayList;
import java.util.Random;

public abstract class Objects extends Actor implements Drop
   {
    private int DropSpeed = 3;
    ArrayList Objects = new ArrayList(3);
    
    public abstract void act(); 
       
    public void drop()
       { 
        setLocation(getX(),getY()+DropSpeed);       
       }
       
    public void ObjectsAppear()
       {
         for(int i = 0; i < 3; i++)
            {
             Actor[] actor ={new Basketball(), new TennisBall(),new SoccerBall()};
             int ColorNumber = Greenfoot.getRandomNumber(3);
             Objects.add(new Basketball());
             Objects.add(new SoccerBall());
             Objects.add(new TennisBall());
            } // end for 
       } // end
       
        
   } // end class
