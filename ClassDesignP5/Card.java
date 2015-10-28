public class Card
    {
     //1. Create Instant Variable
     
     private int num;
     private String suit;
     
     //2. Write constructor to initialize instance variables
     public Card()
        {
         suit = new String("Clubs");
         num = 7;
        }// end constructor Card
        
     public Card( String suit, int num )
        {
            this.suit = new String( suit );
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