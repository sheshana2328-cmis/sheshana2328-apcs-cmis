import javax.swing.JOptionPane;

public class TestOne
    {
        public static void main ( String[] args )
            {
                String int1 = JOptionPane.showInputDialog("Enter an integer:");
                
                int input = Integer.parseInt(int1);
                double doub = (double) input; // convert into double
                
                int[] array = new int [input];
                
                
                for ( int index = 0; index < array.length; index++ )
                    {
                       array[ index ] = (double) (Math.random()*(50+1));
                       System.out.println( array[index] + ":");
                       if( input % 2 == 0 )// find even
                       {
                           System.out.print("E"*array[index]);
                       }
                       else // find odds
                       {
                           System.ot.println("O"*array[index]);
                       }
                   
                       System.out.println( array[index] + ":" ); 
                    }
                while( index < array.length )
                    {
                       
                    }
                   
                
            } // end method main
    } // end class TestOne