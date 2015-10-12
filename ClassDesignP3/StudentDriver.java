import javax.swing.JOptionPane;

public class StudentDriver 
    {
        public static void main ( String[] argv )
            {
                Student senior001 = new Student();
                Student junior001 = new Student("Stacey", "Silva", 1245, 3.876);
                
                System.out.println(senior001);
                System.out.println(junior001);
                JOptionPane.showMessageDialog(null, "Senior Student:\n\n" + senior001 + "\n\nJunior Student:\n\n" + junior001, "CMIS Students", JOptionPane.PLAIN_MESSAGE);
            }
    }// end StudentDriver