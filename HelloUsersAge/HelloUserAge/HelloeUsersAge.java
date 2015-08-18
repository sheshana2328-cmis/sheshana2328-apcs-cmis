import javax.swing.JOptionPane;

public class HelloeUsersAge
        {
        public static void main ( String [] args )
            {
             String input = JOptionPane.showInputDialog( "What is your name?" );
             
             System.out.println( "Hello, " + input + "!" );
            } // end method 
        public static void main ( String  args )
            {
             String input = JOptionPane.showInputDialog( "How old are you?" );
             
             System.out.println( "You are" + input + "years old." );
            } // end method 
        } // end class HelloUsersAge