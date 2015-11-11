import javax.swing.JOptionPane;

public class SongDriver
    {
        public static void main( String[] argv )
            {
                String user = JOptionPane.showInputDialog("Enter a username:");
                String pass = JOptionPane.showInputDialog("Enter a password:");
                
                if ( user.equals("shay")&&pass.equals("123") )
                    {
                        String input = JOptionPane.showInputDialog("Enter Released Date for 'Communist Daughter':");
                        int yr = Integer.parseInt(input);
                        
                        Song Song1 = new Song();
                        Song Song2 = new Song("Matilda", 1204410, 210, 2012); 
                
                        Song1.setYearReleased( yr );
                        System.out.println( Song1 + "\n");
                        System.out.println( Song2 );
                    }
                else
                    {
                        System.out.println("Login unsuccessful… Try again");
                    }

               
            }
    }//end class SongDriver