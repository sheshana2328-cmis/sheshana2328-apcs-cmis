import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare()
        {
            Space space = new Space();
            addObject(space, 200, 200);
            Catz cat = new Catz();
            addObject(cat, 297, 229);
            BasketBall ball1 = new BasketBall();
            addObject(ball1, 297, 0);
            Enemy scoreboard = new Enemy();
            addObject(scoreboard,460, 100);
        }
}
