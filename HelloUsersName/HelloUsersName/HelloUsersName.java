import javax.swing.JOptionPane;

public class HelloUsersName
    {
     public static void main( String[] args)
        {
         String input = JOptionPane.showInputDialog( "What is your name?" );
         
         System.out.println( "Hello, " + input );
        } // end method main
    } // end class HelloUsersName