public class MyPod
    {
       private String colour;
       private int memory;
       private MySong[]  songLibrary;
       
       public MyPod()
           {
               this.colour = new String("Purple");
               this.memory = 5;
               this.songLibrary = new MySong[3];
           }// end zero constructor
           
       public MyPod( String colour, int memory )
            {
                this.colour = new String( colour );
                this.memory = memory;
                this.songLibrary = new MySong[3];
                songLibrary[0] = new MySong("Ziggy Stardust", 5); 
                songLibrary[1] = new MySong("Black Sheep", 5);
                songLibrary[2] = new MySong("Garbage Truck", 4);
            }
      
       public String toString()
            {
                String output = new String();
                output = "The colour of MyPod is: " + colour + "\n" +
                         "It has: " + memory + " GB in memory\n";
                for ( MySong song : songLibrary )
                    {
                        output += song + "\n";
                    }// end for-each
                return output;
            }
       
       
    }// end MyClass