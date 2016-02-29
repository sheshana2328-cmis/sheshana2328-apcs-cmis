import javax.swing.JOptionPane;

public class Array2D3
{
    public static void main (String[] args)
    {
        String rowinput = JOptionPane.showInputDialog("Enter number of Rows:");
        String colinput = JOptionPane.showInputDialog("Enter number of Columns:");
        int ri = Integer.parseInt(rowinput);
        int ci = Integer.parseInt(colinput);

        int[][] mulgrid = new int[ri+1][ci+1];

        for (int i = 0; i < ci+1 ; i++ )
        {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
        for ( int x = 1; x < mulgrid.length; x++)
        {
            System.out.print(x + "\t");
            for ( int y = 1; y < mulgrid[0].length; y++)
            {	
                if( x != 0 && y != 0 ) 
                {
                    mulgrid[x][y] = x*y;
                    System.out.print(mulgrid[x][y] + "\t");
                }
            }
            System.out.print("\n\n");

        }

    }
}//end class Array2D3