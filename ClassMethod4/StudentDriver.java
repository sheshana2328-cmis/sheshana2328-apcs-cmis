import javax.swing.JOptionPane;

public class StudentDriver 
    {
        public static void main ( String[] argv )
            {
                Student senior001 = new Student();
                Student junior001 = new Student( "Joe", "Senior", 4.0, 4.0, 3.5, 4.0, 4.0 );
                
                System.out.println(senior001 + "\n\n");
                System.out.println(junior001+ "\n");
                System.out.println("Setting all grades to 4.0");
                junior001.setGPA( 4.0, 4.0, 4.0, 4.0, 4.0 );
                System.out.println("\n" + junior001);
                //JOptionPane.showMessageDialog(null, "Senior Student:\n\n" + senior001 + "\n\nJunior Student:\n\n" + junior001, "CMIS Students", JOptionPane.PLAIN_MESSAGE);
            }
    }// end StudentDriver