import javax.swing.JOptionPane;

public class FundamentalsP2
    {
     public static void main ( String[] args )
        {
          String Num1, Num2;
          
          Num1 = JOptionPane.showInputDialog("Enter a number:");
          Num2 = JOptionPane.showInputDialog("Enter another number:");
          
          int a = Integer.parseInt(Num1); 
          int b = Integer.parseInt(Num2); 
          
          if( a > b )
            {
             System.out.println("The value of A is " + a + " and it is greater than B whose value is " + b + ".");
            }
          if( a < b )
            {
             System.out.println("The value of A is " + a + " and it is less than B whose value is " + b + ".");
            }
          else
            {
             System.out.println("The value of A is " + a + " and it is equal to B whose value is also " + b + ".");
            }
         }
    }