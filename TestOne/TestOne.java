import javax.swing.JOptionPane;

public class TestOne
    {
        public static void main ( String[] args )
            {
                String int1 = JOptionPane.showInputDialog("Enter an integer:");
                
                int input = Integer.parseInt(int1);
                
                int[] array = new int [input];
                
                for ( int index = 0; index < array.length; index++ )
                    {
                       array[ index ] = (int) (Math.random()*(50+1));
                       System.out.println(array[index] + " ");

                    }
                
            } // end method main
    } // end class TestOne