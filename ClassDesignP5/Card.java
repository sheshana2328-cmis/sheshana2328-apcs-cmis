public class Card
    {
        private int value;
        private String suit;
        
        public Card()
            {
             value = 3;
             suit = new String ("Spades");
            }
            
        public String toString()
            {
             String output = new String();
             output = value + " of " + suit;
             return output;
            }
    }// end class Card