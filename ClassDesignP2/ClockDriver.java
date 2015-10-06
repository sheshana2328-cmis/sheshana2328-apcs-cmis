import javax.swing.JOptionPane;

public class ClockDriver
    {
        public static void main ( String[] argv )
            {
                
                Clock kitchenClock = new Clock();
                
                String hour = JOptionPane.showInputDialog("What is the hour?");
                
                Clock bedroomClock = new Clock();
                
                System.out.println( kitchenClock );
            }
    }//end class ClockDriver