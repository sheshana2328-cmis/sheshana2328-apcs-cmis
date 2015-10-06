public class SongDriver
    {
        public static void main( String[] argv )
            {
                Song Song1 = new Song();
                Song Song2 = new Song("Matilda", 1204410, 3.50); 
                
                System.out.println( Song1 + "\n");
                System.out.println( Song2 );
            }
    }//end class SongDriver