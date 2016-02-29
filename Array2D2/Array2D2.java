public class Array2D2
{
    public static void main (String[] argv)
    {
        int[][] ranNum = new int[3][5];
        int starter = 0;
        int total = 0;
        int[] rowto = new int[ranNum.length];
        int[] colto = new int[ranNum[0].length];
        int amountrow = 0;
        int amountcol = 0;

        for ( int row = 0; row < ranNum.length; row++)
        {
            for ( int col = 0; col < ranNum[0].length; col++)
            {
                ranNum[row][col] = starter + 1;
                starter = ranNum[row][col];
                total += ranNum[row][col];
            }//end inner for loop
        }//end outer for loop

        for ( int[] row : ranNum )
        {
            for ( int num : row )
            {
                System.out.print( num + " \t ");
            }//end inner for loop
            System.out.println("\n");
        }//end outer for loop

        System.out.println( "\nSum of Total: " + total + "\n");

        for ( int row = 0; row < ranNum.length; row++ )
        {
            for ( int i = 0; i < ranNum[0].length; i++) 
            {
                amountrow = amountrow + ranNum[row][i];
                if ( i == ranNum[0].length - 1 )
                {
                    rowto[row] = amountrow;
                    System.out.println("Sum of Total in Row: " + (row + 1) +": "+  amountrow + "\n");
                    amountrow = 0;
                }

            }
        }

        for ( int col = 0; col < ranNum[0].length; col++ )
        {
            for ( int i = 0; i < ranNum.length; i++) 
            {
                colto[col] += ranNum[i][col];
                amountcol = 0;
            }
            amountcol += colto[col];
            System.out.println("Sum of Total in Column: " + (col + 1) +": "+  amountcol + "\n");
        }        
    }
}