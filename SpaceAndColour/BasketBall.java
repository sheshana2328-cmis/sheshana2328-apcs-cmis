import greenfoot.*;  
public class BasketBall extends Enemy implements Survive
{
    int score = 0; 
    int holder = 1;
    public BasketBall()
        {
        GreenfootImage image = getImage();
        image.scale(60,60);
        setImage(image);  
        }
    public void act() 
    {
        drop();
        getScore();
        survive();
    }  
    public void drop()
    {
        setLocation(getX(),getY()+1);
    }
    public int getScore()
        {
            return score;
        }    
        
    public void survive()
        {
            Actor enemy = getOneIntersectingObject(Catz.class);
            if(isAtEdge())
                {
                    score++;
                    if (score == holder)
                        {
                            getWorld().removeObject(this);
                            holder++;
                        }
                }
        }
}
