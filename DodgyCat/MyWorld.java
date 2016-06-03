import greenfoot.*; 
import java.util.ArrayList;
import java.util.Random; 
 
public class MyWorld extends World
   {
    ArrayList Objects = new ArrayList(3);
    
    public MyWorld()
       {    
        super(600, 400, 1); 
        ObjectsAppear();
        prepare();
        ExtraDrop();
        int i = 0;
        while (i < 3) 
           {
            Random generator = new Random();  
            Actor spawn = (Actor)Objects.get(generator.nextInt(Objects.size()));
            addObject(spawn, Greenfoot.getRandomNumber(getWidth()), getHeight() - 400);
            i++;
           }    
        
       } // end
       
    public void prepare()
       {                  
         Pattern space = new Pattern();
         addObject(space, 200, 200);
         Catz cat = new Catz();
         addObject(cat, 297, 300);
         Score score = new Score();
         addObject(score,550,26);
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
        
    public void ExtraDrop()
       {
        int i = 0;
        while (i < 2) 
           {
            addObject(new Mushroom(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(560));  //only use getWorld() if this is on an actor class;
            i++;
           }    
       }
       
   } // end class
