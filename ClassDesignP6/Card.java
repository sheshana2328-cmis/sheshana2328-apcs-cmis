public class Card
    {
     //1. Create Instant Variable
     
     private String num;
     private String suit;
     
     //2. Write constructor to initialize instance variables
     public Card()
        {
         suit = new String("Clubs");
         num = "7";
        }// end constructor Card
        
     public Card( String suit, String num )
        {
            //String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
            //int[] numval = {1,2,3,4,5,6,7,8,9,10,11,12,13};
            this.suit = suit;
            this.num = num;
        }
     //3. toString()
     public String toString()
        {
         String output = new String();
         output = num + " of " + suit;  
         return output;       
        }// end method toString()
        
    }// end class Song