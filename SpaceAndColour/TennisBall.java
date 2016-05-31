import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TennisBall extends Enemy implements Survive
{
    int score = 0;
    public TennisBall()
        {
        GreenfootImage image = getImage();
        image.scale(35,35);
        setImage(image);  
        }
    public void act() 
    {
        survive();
    }    
    public int getScore()
        {
            return score;
        }
    public void survive()
        {
            if(isAtEdge())
                {
                    score++;
                }
        }
}
