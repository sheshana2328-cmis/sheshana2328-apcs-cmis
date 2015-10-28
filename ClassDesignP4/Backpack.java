public class Backpack
    {
        private String colour;
        private double cost;
        
        public Backpack()
            {
                colour = new String("Indigo");
                cost = 17.56;
            }//end constructor Backpack
            
        public Backpack( String colour, double cost)
            {
                this.colour = new String(colour);
                this.cost = cost;
            }
            
        public String toString()
            {
                String output = new String();
                output = "Backpack Colour:" + colour + "\n" +
                         "Cost: $" + cost;
                return output;
            }//end method toString()
            
    } //end of class Backpack