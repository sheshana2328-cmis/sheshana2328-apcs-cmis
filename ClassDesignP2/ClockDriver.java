import javax.swing.JOptionPane;

public class ClockDriver
    {
        public static void main ( String[] argv )
            {
                
                Clock kitchenClock = new Clock();
                
                int hour = Integer.parseInt(JOptionPane.showInputDialog("What is the hour?"));
                int min = Integer.parseInt(JOptionPane.showInputDialog("What is the minute?"));
                int sec = Integer.parseInt(JOptionPane.showInputDialog("What is the second?"));
                
                Clock bedroomClock = new Clock(hour, min, sec);
                
                System.out.println( "The kitchen clock " + kitchenClock );
                System.out.println( "The bedroom clock " + bedroomClock );
            }
    }//end class ClockDriver