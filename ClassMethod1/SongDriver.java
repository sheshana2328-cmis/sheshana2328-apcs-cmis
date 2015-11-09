import javax.swing.JOptionPane;

public class SongDriver
    {
        public static void main( String[] argv )
            {
                String user = JOptionPane.showInputDialog("Enter a username:");
                String pass = JOptionPane.showInputDialog("Enter a password:");
                
                
                //int ps = Integer.parseInt(pass);
                //int yr = Integer.parseInt(input);
                
                if ( user.equals("shay")&&pass.equals("123") )
                    {
                        String input = JOptionPane.showInputDialog("Enter Released Date for 'Communist Daughter':");
                        int yr = Integer.parseInt(input);
                        
                        Song Song1 = new Song();
                        Song Song2 = new Song("Matilda", 1204410, 3.50, 2012); 
                
                        Song1.setYearReleased( yr );
                        System.out.println( Song1 + "\n");
                        System.out.println( Song2 );
                    }
                else
                    {
                        System.out.println("Login unsuccessful… try again");
                    }

                /*System.out.println( Song1.getYearReleased() );
                Song1.setYearReleased( 1998 );
                System.out.println( Song1.getYearReleased() );
                System.out.println( Song1 + "\n");*/
            }
    }//end class SongDriver