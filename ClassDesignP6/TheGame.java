public class TheGame
    {
        public static void main (String[] argv)
            {
             String suit[] = {"Clubs", "Hearts", "Spades", "Diamonds"};
             String numval[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
             
             String score = new String("");
             String suits;
             String value;
             
             String Dealer[] = new String [2];
             String Player1[] = new String [2];
             String Player2[] = new String [2];
             String Player3[] = new String [2];          
             String Player4[] = new String [2];
             String Player5[] = new String [2];
             
             System.out.print("Dealer: \n\n");
             
             for (int i = 0; i < Dealer.length; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                  
                  System.out.println(myHand);
                }
                
             System.out.print("\nPlayer1: \n\n");
             
             for (int i = 0; i < Player1.length; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                  
                  System.out.println(myHand);
                }
                
             System.out.print("\nPlayer2: \n\n");
                
             for (int i = 0; i < Player2.length; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                  
                  System.out.println(myHand);
                }
                
             System.out.print("\nPlayer3: \n\n");
                
             for (int i = 0; i < Player3.length; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                  
                  System.out.println(myHand);
                }
                
             System.out.print("\nPlayer4: \n\n");
             
             for (int i = 0; i < Player4.length; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                  
                  System.out.println(myHand);
                }
                
             System.out.print("\nPlayer5: \n\n");
                
             for (int i = 0; i < Player5.length; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                  
                  System.out.println(myHand);
                }
                
                
            }
    }