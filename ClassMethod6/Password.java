import javax.swing.JOptionPane;

public class Password
{
    public static void main ( String[] args )
    {
        int count = 0;
        String pass = new String(JOptionPane.showInputDialog("Enter your password: [It has to have a length of at least 6 characters and at least one non-alphanumeric character (+, -, *, /, or @)]"));

        for(int i=0; i<pass.length(); i++)
        {
            if(pass.substring(i).equals("+")||pass.substring(i).equals("-")||pass.substring(i).equals("*")||pass.substring(i).equals("/")||pass.substring(i).equals("@"))
            {
                count+=1;
                //System.out.println(count);
            }
            else
            {
                count = count;
            }
        }
        if (pass.length() < 6 || count == 0)
        {
            System.out.println("This didn't work, try again?");
        }
        else
        {
            System.out.println("Congratulations! It worked!");
        }

    } // end method Main
} //end class Password