package Fundamentals6;

public class FundamentalsP6
    {
        public static void main ( String[] args )
            {
             int[] randomNumbers = new int[50];
             
             for ( int index = 0; index < randomNumbers.length; index++ )
                {
                 randomNumbers[ index ] = (int) ( Math.random()*100 );
                 System.out.print( randomNumbers[ index ] + " " );
                } // end for
            } // end method main
    } // end class FundamentalsP6