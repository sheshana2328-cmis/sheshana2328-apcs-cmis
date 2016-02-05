import java.util.ArrayList;

public class MyPod
{
    private String colour;
    private int memory;
    private ArrayList<String> myPod = new ArrayList<String>();

    public MyPod()
    {
        this.colour = new String("Purple");
        this.memory = 5;
        myPod.add("Roses");
        myPod.add("Catch and Release");
        myPod.add("Smelly Cat");
    }// end zero constructor

    public MyPod( String colour, int memory )
    {
        this.colour = new String( colour );
        this.memory = memory;
        myPod.add("Roses");
        myPod.add("Catch and Release");
        myPod.add("Smelly Cat");
    }

    public String toString()
    {
        String output = new String();
        output = "The colour of MyPod is: " + colour + "\n" +
        "It has: " + memory + " GB in memory\nThe number of songs in this Pod: " + myPod.size() + "\n\n";
        for ( String song : myPod )
        {
            output += song + "\n";
        }// end for-each
        return output;
    }

}// end MyClass