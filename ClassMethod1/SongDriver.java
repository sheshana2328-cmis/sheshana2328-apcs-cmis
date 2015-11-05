public class SongDriver
    {
        public static void main( String[] argv )
            {
                Song Song1 = new Song();
                Song Song2 = new Song("Matilda", 1204410, 3.50, 2012); 
                
                System.out.println( Song1 + "\n");
                System.out.println( Song2 );
                System.out.println( "\n\n" );
                
                System.out.println( Song1.getYearReleased() );
                Song1.setYearReleased( 2343 );
                System.out.println( Song1.getYearReleased() );
                System.out.println( Song1 + "\n");
            }
    }//end class SongDriver