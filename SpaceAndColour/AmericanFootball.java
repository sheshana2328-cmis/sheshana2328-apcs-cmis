import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AmericanFootball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AmericanFootball extends Enemy implements Survive
{
    int score = 0;
    public AmericanFootball()
        {
        GreenfootImage image = getImage();
        image.scale(75,75);
        setImage(image);  
        }
    public void act() 
    {
        survive();
        getScore();
        drop();
    }    
    public int getScore()
        {
            return score;
        }
    public void drop()
    {
        setLocation(getX(),getY()+3);
        
    }
    public void survive()
        {
            if(isAtEdge())
                {
                    score++;
                }
        }
}
