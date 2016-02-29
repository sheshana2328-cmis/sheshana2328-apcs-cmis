import javax.swing.JOptionPane;

public class Password
   {
    public static void main(String [] args)
       {
        String lastName = JOptionPane.showInputDialog( "What is your lastname?");
        String password = JOptionPane.showInputDialog( "What is your password?");
        
        String convertLastName = lastName.toLowerCase();
        String convertPassword = password.toLowerCase();

        for ( int pass = 0; pass >= 0; pass++ )
           {
            pass = convertPassword.indexOf(convertLastName);
            if(pass >= 0)
               {
                convertPassword = JOptionPane.showInputDialog( "You can't include your last name. Please try a different password:").toLowerCase();
               }
            else
               {
                System.out.print("You have successfuly logged in!");
                break;
               }
           }

       }
   }