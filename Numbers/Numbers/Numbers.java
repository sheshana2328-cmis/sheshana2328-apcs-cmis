import javax.swing.JOptionPane;
import java.lang.Math;

public class Numbers
    {
     public static void main( String[] args )   
        {
         String one = JOptionPane.showInputDialog("Choose a number");
         String two = JOptionPane.showInputDialog("Choose another number");
         
         double oneone = Double.parseDouble(one);
         double twotwo = Double.parseDouble(two);
         
         double one1 = oneone + twotwo;
         double two2 = oneone - twotwo;
         double three3 = oneone * twotwo;
         double four4 = oneone / twotwo;
         double five5 = oneone % twotwo;
         
         System.out.println( oneone + "+" + twotwo + "=" + one1 + "\n" );
         System.out.println( oneone + "-" + twotwo + "=" + two2 + "\n" );
         System.out.println( oneone + "*" + twotwo + "=" + three3 + "\n" );
         System.out.println( oneone + "/" + twotwo + "=" + four4 + "\n" );
         System.out.println( oneone + "%" + twotwo + "=" + five5 + "\n" );
         
        } //end method main
    } // end class Numbers