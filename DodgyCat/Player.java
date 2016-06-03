import greenfoot.*; 
import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;

public abstract class Player extends Actor
   {   
    int score = 0;
    ArrayList Objects = new ArrayList(3);
    
    public void act() 
       {
        move();
        Over();
        Points();
       } // end
       
    public void move()
       {
        if (Greenfoot.isKeyDown("left"))
           {
            move(-6);
           }
        if (Greenfoot.isKeyDown("right"))
           {
            move(6);
           }
        if(Greenfoot.isKeyDown("down"))
           {
            setLocation(getX(),getY()+3);
           }   
        if(Greenfoot.isKeyDown("up"))
           {
            setLocation(getX(),getY()-3);
           }   
        } // end
        
    public void Over()
       {
        Actor objects;
        objects = getOneObjectAtOffset(0,0,Objects.class);
     
        if( objects != null)
           {
            Greenfoot.stop();
            getWorld().addObject(new GameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);
           } // end for  
       } // end
       
    public void Points()
       {
        Actor Extras;
        Extras = getOneObjectAtOffset(0,0,Extras.class);
     
        if( Extras != null)
           {
            World world;
            world = getWorld();
            world.removeObject(Extras); 
            score = score + 1;
            
            getWorld().addObject(new Mushroom(), Greenfoot.getRandomNumber(getWorld().getWidth()), getWorld().getHeight() - 400);
           } // end for  
       } // end
       
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
       
    public int getScore()
       {    
        return score;
       }
   } // end class
