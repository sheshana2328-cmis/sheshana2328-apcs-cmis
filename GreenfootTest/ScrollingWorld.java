import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * This world contains the main part of the scrolling system.
 * 
 * Here you can also limit the world by changing the variables WORLD_WIDTH and WORLD_HEIGHT using the constructor of the class (see ExampleWorld).
 * You can create scrolling worlds in every screen size (the size of the frame) and every scrolling size (the real size of the world).
 * 
 * The GreenfootImage textur is the background image that is used for the scrolling background. You can use any image you want instead of this. 
 * You just have to call the method setScrollingBackground in the constructor of your scrolling world (see ExampleWorld) with the GreenfootImage you want to use for the background.
 * 
 * The scenario will automaticly create a example world. You can delete this world and use another subclass of this world if you want to use the scrolling system in your scenario.
 * 
 * 
 * You shouldn't change the code of this class because that will probably cause problems in the scrolling system.
 */
public abstract class ScrollingWorld extends World
{
    //A maximum size of the Scrolling World. If the value for width or height is 0 the world is infinite in this direction.
    //The variables are final so they have to be set before compiling the game and can't be set while executing the game.
    public static int WORLD_WIDTH;
    public static int WORLD_HEIGHT;
    
    protected int totalXMovement = 0;
    protected int totalYMovement = 0;
   
    
    public ScrollingWorld(int screenWidth, int screenHeight) {
        super(screenWidth, screenHeight, 1, false);
        WORLD_WIDTH = 0;
        WORLD_HEIGHT = 0;
    }
    public ScrollingWorld(int screenWidth, int screenHeight, int cellSize) {
        super(screenWidth, screenHeight, cellSize, false);
        WORLD_WIDTH = 0;
        WORLD_HEIGHT = 0;
    }
    public ScrollingWorld(int screenWidth, int screenHeight, int scrollingWidth, int scrollingHeight) {
        super(screenWidth, screenHeight, 1, false);
        WORLD_WIDTH = scrollingWidth;
        WORLD_HEIGHT = scrollingHeight;
    }
    public ScrollingWorld(int screenWidth, int screenHeight, int cellSize, int scrollingWidth, int scrollingHeight) {
        super(screenWidth, screenHeight, cellSize, false);
        WORLD_WIDTH = scrollingWidth;
        WORLD_HEIGHT = scrollingHeight;
    }
    
    /**
     * Reset the position of the ScrollingActor and set the position of all other objects in the world.
     */
    public final void resetPlayersPosition(ScrollingActor scrollingActor) {
        int xMovement = (int) ((double) getWidth()/2 - scrollingActor.getExactX());
        int yMovement = (int) ((double) getHeight()/2 - scrollingActor.getExactY());
        totalXMovement += xMovement;
        totalYMovement += yMovement;
        List<Actor> actors = getObjects(Actor.class);
        for (Actor actor : actors) {
            if (actor instanceof ScrollingActor) {
                ((ScrollingActor) actor).setLocation(actor.getX() + xMovement, actor.getY() + yMovement, false);
            }
            
            else {
                actor.setLocation(actor.getX() + xMovement, actor.getY() + yMovement);
            }
        }
        
    }
    
   
    /**
     * Remove all objects that currently are in the world.
     */
    public void removeAllObjects() {
        removeObjects(getObjects(null));
    }
    
    /**
     * Remove all objects that currently are in the world with the exception of the actor given as parameter.
     * 
     * @param actor
     *      The only object that will not be removed from the world.
     */
    public void removeAllObjectsBut(Actor actor) {
        List<Actor> allActors = getObjects(null);
        for (Actor a : allActors) {
            if (!a.equals(actor)) {
                removeObject(a);
            }
        }
    }
    
    /**
     * Returns the width of to scrolling world. (0 => infinite).
     * 
     * @return
     *      The width of the scrolling system. If 0 is returned the world width is infinite.
     */
    public int getScrollingWidth() {
        return WORLD_WIDTH;
    }
    /**
     * Returns the height of to scrolling world. (0 => infinite).
     * 
     * @return
     *      The height of the scrolling system. If 0 is returned the world height is infinite.
     */
    public int getScrollingHeight() {
        return WORLD_HEIGHT;
    }
    
    /**
     * Get the total movement in x direction.
     * 
     * @return
     *      The total movement in x direction the scrolling actor has covered.
     */
    public int getTotalXMovement() {
        return totalXMovement;
    }
    /**
     * Get the total movement in y direction.
     * 
     * @return
     *      The total movement in y direction the scrolling actor has covered.
     */
    public int getTotalYMovement() {
        return totalYMovement;
    }
}