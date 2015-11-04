public class TheGame
    {
        public static void main (String[] argv)
            {
             String suit[] = {"Clubs", "Hearts", "Spades", "Diamonds"};
             String numval[] = {"2","3","4","5","6","7","8","9","10","J","Q","K", "A"};
             int points[] = new int [2];
             int pntsd = 0;
             //int pntval;
             int pntsone = 0;
             int pntstwo = 0;
             int pntsthree = 0;
             int pntsfour = 0;
             int pntsfive = 0;
             
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
                  if ( value == "A" )
                    {
                        pntsd += 1;
                    }
                  else if ( value == "J" )
                    {
                        pntsd += 10;
                    }
                  else if ( value == "Q" )
                    {
                        pntsd += 10;
                    }
                  else if ( value == "K" )
                    {
                        pntsd += 10;
                    }
                  else if ( value == "2" )
                    {
                        pntsd += 2;
                     }
                  else if ( value == "3" )
                    {
                        pntsd += 3;
                     }
                  else if ( value == "4" )
                    {
                        pntsd += 4;
                     }
                  else if ( value == "5" )
                    {
                        pntsd += 5;
                     }
                  else if ( value == "6" )
                    {
                        pntsd += 6;
                     }
                  else if ( value == "7" )
                    {
                        pntsd += 7;
                     }
                  else if ( value == "8" )
                    {
                        pntsd += 8;
                     }
                  else if ( value == "9" )
                    {
                        pntsd += 9;
                     }
                  else if ( value == "10" )
                    {
                        pntsd += 10;
                     }
                  System.out.println(myHand);
                  //System.out.println(pnts);
                 }
             //System.out.println(pntsd);
             System.out.print("\nPlayer1: \n\n");
             
             for (int i = 0; i < Player1.length; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                   if ( value == "A" )
                    {
                        pntsone += 1;
                    }
                  else if ( value == "J" )
                    {
                        pntsone += 10;
                    }
                  else if ( value == "Q" )
                    {
                        pntsone += 10;
                    }
                  else if ( value == "K" )
                    {
                        pntsone += 10;
                    }
                  else if ( value == "2" )
                    {
                        pntsone += 2;
                     }
                  else if ( value == "3" )
                    {
                        pntsone += 3;
                     }
                  else if ( value == "4" )
                    {
                        pntsone += 4;
                     }
                  else if ( value == "5" )
                    {
                        pntsone += 5;
                     }
                  else if ( value == "6" )
                    {
                        pntsone += 6;
                     }
                  else if ( value == "7" )
                    {
                        pntsone += 7;
                     }
                  else if ( value == "8" )
                    {
                        pntsone += 8;
                     }
                  else if ( value == "9" )
                    {
                        pntsone += 9;
                     }
                  else if ( value == "10" )
                    {
                        pntsone += 10;
                     }
                  System.out.println(myHand);
                }
                
             System.out.print("\nPlayer2: \n\n");
                
             for (int i = 0; i < Player2.length; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                   if ( value == "A" )
                    {
                        pntstwo += 1;
                    }
                  else if ( value == "J" )
                    {
                        pntstwo += 10;
                    }
                  else if ( value == "Q" )
                    {
                        pntstwo += 10;
                    }
                  else if ( value == "K" )
                    {
                        pntstwo += 10;
                    }
                  else if ( value == "2" )
                    {
                        pntstwo += 2;
                     }
                  else if ( value == "3" )
                    {
                        pntstwo += 3;
                     }
                  else if ( value == "4" )
                    {
                        pntstwo += 4;
                     }
                  else if ( value == "5" )
                    {
                        pntstwo += 5;
                     }
                  else if ( value == "6" )
                    {
                        pntstwo += 6;
                     }
                  else if ( value == "7" )
                    {
                        pntstwo += 7;
                     }
                  else if ( value == "8" )
                    {
                        pntstwo += 8;
                     }
                  else if ( value == "9" )
                    {
                        pntstwo += 9;
                     }
                  else if ( value == "10" )
                    {
                        pntstwo += 10;
                     }
                  System.out.println(myHand);
                }
                
             System.out.print("\nPlayer3: \n\n");
                
             for (int i = 0; i < Player3.length; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                   if ( value == "A" )
                    {
                        pntsthree += 1;
                    }
                  else if ( value == "J" )
                    {
                        pntsthree += 10;
                    }
                  else if ( value == "Q" )
                    {
                        pntsthree += 10;
                    }
                  else if ( value == "K" )
                    {
                        pntsthree += 10;
                    }
                  else if ( value == "2" )
                    {
                        pntsthree += 2;
                     }
                  else if ( value == "3" )
                    {
                        pntsthree += 3;
                     }
                  else if ( value == "4" )
                    {
                        pntsthree += 4;
                     }
                  else if ( value == "5" )
                    {
                        pntsthree += 5;
                     }
                  else if ( value == "6" )
                    {
                        pntsthree += 6;
                     }
                  else if ( value == "7" )
                    {
                        pntsthree += 7;
                     }
                  else if ( value == "8" )
                    {
                        pntsthree += 8;
                     }
                  else if ( value == "9" )
                    {
                        pntsthree += 9;
                     }
                  else if ( value == "10" )
                    {
                        pntsthree += 10;
                     }
                  System.out.println(myHand);
                }
                
             System.out.print("\nPlayer4: \n\n");
             
             for (int i = 0; i < Player4.length; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                   if ( value == "A" )
                    {
                        pntsfour += 1;
                    }
                  else if ( value == "J" )
                    {
                        pntsfour += 10;
                    }
                  else if ( value == "Q" )
                    {
                        pntsfour += 10;
                    }
                  else if ( value == "K" )
                    {
                        pntsfour += 10;
                    }
                  else if ( value == "2" )
                    {
                        pntsfour += 2;
                     }
                  else if ( value == "3" )
                    {
                        pntsfour += 3;
                     }
                  else if ( value == "4" )
                    {
                        pntsfour += 4;
                     }
                  else if ( value == "5" )
                    {
                        pntsfour += 5;
                     }
                  else if ( value == "6" )
                    {
                        pntsfour += 6;
                     }
                  else if ( value == "7" )
                    {
                        pntsfour += 7;
                     }
                  else if ( value == "8" )
                    {
                        pntsfour += 8;
                     }
                  else if ( value == "9" )
                    {
                        pntsfour += 9;
                     }
                  else if ( value == "10" )
                    {
                        pntsfour += 10;
                     }
                  System.out.println(myHand);
                }
                
             System.out.print("\nPlayer5: \n\n");
                
             for (int i = 0; i < Player5.length; i++)
                {
                  suits = suit[(int)(Math.random()*suit.length)];
                  value = numval[(int)(Math.random()*numval.length)];
                  Card myHand = new Card( suits, value );
                   if ( value == "A" )
                    {
                        pntsfive += 1;
                    }
                  else if ( value == "J" )
                    {
                        pntsfive += 10;
                    }
                  else if ( value == "Q" )
                    {
                        pntsfive += 10;
                    }
                  else if ( value == "K" )
                    {
                        pntsfive += 10;
                    }
                  else if ( value == "2" )
                    {
                        pntsfive += 2;
                     }
                  else if ( value == "3" )
                    {
                        pntsfive += 3;
                     }
                  else if ( value == "4" )
                    {
                        pntsfive += 4;
                     }
                  else if ( value == "5" )
                    {
                        pntsfive += 5;
                     }
                  else if ( value == "6" )
                    {
                        pntsfive += 6;
                     }
                  else if ( value == "7" )
                    {
                        pntsfive += 7;
                     }
                  else if ( value == "8" )
                    {
                        pntsfive += 8;
                     }
                  else if ( value == "9" )
                    {
                        pntsfive += 9;
                     }
                  else if ( value == "10" )
                    {
                        pntsfive += 10;
                     }
                  System.out.println(myHand);
                }
                
             System.out.println( "\nTotal Score\n===========================\nDealer: " + pntsd + "\n" +
                                 "Player1: " + pntsone + "\n" + 
                                 "Player2: " + pntstwo + "\n" +
                                 "Player3: " + pntsthree + "\n" +
                                 "Player4: " + pntsfour + "\n" +
                                 "Player5: " + pntsfive + "\n");   
                              
             System.out.println("Player Status\n===========================");
                                 
            if ( pntsone > pntsd )
                {
                 System.out.println("Player1 beats dealer!");
                }
            else 
                {
                 System.out.println("Player1 lost to dealer!");
                }
            if ( pntstwo > pntsd )
                {
                 System.out.println("Player2 beats dealer!");
                }
            else 
                {
                 System.out.println("Player2 lost to dealer!");
                }
            if ( pntsthree > pntsd )
                {
                 System.out.println("Player3 beats dealer!");
                }
            else 
                {
                 System.out.println("Player3 lost to dealer!");
                }
            if ( pntsfour > pntsd )
                {
                 System.out.println("Player4 beats dealer!");
                }
            else 
                {
                 System.out.println("Player4 lost to dealer!");
                }
            if ( pntsfive > pntsd )
                {
                 System.out.println("Player5 beats dealer!");
                }
            else 
                {
                 System.out.println("Player5 lost to dealer!");
                }
                
            }
    }