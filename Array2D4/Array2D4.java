import javax.swing.JOptionPane;

public class Array2D4
{
    public static void main (String[] argv)
    {
        String rowinput = JOptionPane.showInputDialog("Enter number of Rows:");
        String colinput = JOptionPane.showInputDialog("Enter number of Columns:");
        String lowerUpper = JOptionPane.showInputDialog("Lower or Upper Case? (input 'lower'/'upper'):");
        int ri = Integer.parseInt(rowinput);
        int ci = Integer.parseInt(colinput);
        String[][] alphagrid = new String[ci][ci];
        String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z" };
        int ctr = 0;

        if (lowerUpper.equals("upper"))
        {
            for ( int x = 0; x < alphagrid.length; x++)
            {
                for (int y = 0; y < alphagrid[0].length; y++)
                {
                    if (ctr < 26)
                    {
                        alphagrid[x][y] = alpha[ctr];
                    }
                    else
                    {
                        ctr = 0;
                        alphagrid[x][y] = alpha[ctr];
                    }
                    ctr++;
                    if (x % 2 == 0)
                    {
                        System.out.print(alphagrid[x][y]+"\t\t");
                    }
                    else
                    {
                        System.out.print("\t" + alphagrid[x][y]);
                    }//end else
                }//end inner for loop
                System.out.print("\n\n");
            }// end outer for loop
        }//end if
        else if (lowerUpper.equals("lower"))
        {
            for ( int x = 0; x < alphagrid.length; x++)
            {
                for (int y = 0; y < alphagrid[0].length; y++)
                {
                    if (ctr < 26)
                    {
                        alphagrid[x][y] = alpha[ctr];
                    }
                    else
                    {
                        ctr = 0;
                        alphagrid[x][y] = alpha[ctr];
                    }
                    ctr++;
                    if (x % 2 == 0)
                    {
                        System.out.print(alphagrid[x][y].toLowerCase()+"\t");
                    }//end if 
                    else
                        {
                        System.out.print("\t" + alphagrid[x][y].toLowerCase());  
                        }//end else
                }//end inner for loop
                System.out.print("\n\n");
            }// end outer for loop
        }//end 

    }//end method main
}//end class Array2D4