public class CardDriver
    {
        public static void main ( String[] argv )
            {
             String suit[] = {"Clubs", "Hearts", "Spades", "Diamonds"};
             String numval[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
             int nCards = 3;
             String suits;
             String value;
             
             System.out.println("Zero Args\n=========");
             
             for ( int i = 0; i < 1; i++ )
                {
                    Card FirstCard = new Card();
                    System.out.println(FirstCard + "\n");
                }

             System.out.println("Two Args\n=========");
      
             for (int i = 0; i < nCards; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                  
                  System.out.println(myHand);
                }
                
             
            }
    }