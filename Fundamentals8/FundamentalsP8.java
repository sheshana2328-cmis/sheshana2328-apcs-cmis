public class FundamentalsP8
    {
        public static void main ( String[] args )
            {
                String fa1 = "Childish Gambino";
                String fa2 = "Daniela Andrade";
                String fa3 = "Neutral Milk Hotel";
                
                String artist[] = {fa1, fa2, fa3};
                for (int index = 0; index<artist.length; index++)
                    {
                        System.out.print(artist[index] + ", ");
                    } // end for
                System.out.println( "\n" );
                
                artist[((int)(3*Math.random()))] = "Michael Jackson";
                
                for (int index = 0; index<artist.length; index++ )
                    {
                        System.out.println(artist[index]);
                    } // end for
                    
               if ( artist.equals("Michael Jackson"))
              {
                  System.out.println("We found Michael!");
              }
              else 
              {
                  System.out.println("No Michael in music ")
              }
            } // end method main
    } // end class FundamentalsP8