import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Enemy extends Actor
{
    int score = 0; 
    
    public void act() 
    {
      int score = ((BasketBall) getWorld().getObjects(BasketBall.class).get(0)).getScore();
      setImage(new GreenfootImage("Score: " + score + " ", 21, Color.black, Color.white));
    }    
    
    
}
