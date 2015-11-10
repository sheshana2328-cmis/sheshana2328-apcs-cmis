public class SimpleCardDriver
    {
        public static void main( String[] argv )
            {
               SimpleCard[] deck = new SimpleCard[52];
               
               String suit[] = {"Clubs", "Hearts", "Spades", "Diamonds"};
               String numval[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
               
               String suits;
               String ranks;
               
               for (int i = 0; i < deck.length; i++)
                {
                  for (int i = 0; i < )
                  
                     suits = suit[i];
                     ranks = numval[i];
                     SimpleCard myHand = new SimpleCard( suits, ranks );
                  
                     System.out.println(myHand);
                    
                   
                }
              
            }
    }//end class SimpleCardDriver