import javax.swing.JOptionPane;

public class FundamentalsP3
    {
    public static void main ( String[] args )
        {
         String Num1;
         
         Num1 = JOptionPane.showInputDialog("Enter a number:");
         
         int an = Integer.parseInt(Num1);
         
         int ab = an % 2;
         
         if ( ab == 0)
            {
             System.out.println( an + " is an even number");
            } // end if
         else 
            {
             System.out.println( an + " is an odd number");
            } // end else
        } //end main
    } // end class
    