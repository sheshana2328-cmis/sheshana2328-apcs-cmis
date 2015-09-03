import javax.swing.JOptionPane;

public class FundamentalsP9
    {
        public static void main ( String[] args )
            {
                String user = JOptionPane.showInputDialog("Enter a username:");
                String pass = JOptionPane.showInputDialog("Enter a password");
                
                int ps = Integer.parseInt(pass);
                
                if ( user.equals("shay")&&ps==123 )
                    {
                        System.out.println("You have successfully logged in!");
                    }
                else
                    {
                        System.out.println("Login unsuccessful… try again");
                    }
            }
    }