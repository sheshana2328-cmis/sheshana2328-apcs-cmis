public class Array2d1
{
    public static void main (String[] argv) 
    {
        int[][] ranNum = new int[3][4];
        int indrow = 0;
        int indcol = 0;

        for ( int row = 0; row < ranNum.length; row++)
        {
            for ( int col = 0; col < ranNum[0].length; col++)
            {
                ranNum[row][col] = (int)(Math.random()*10);

                if ( ranNum[row][col] == 5)
                {
                    indrow = 1 + row;
                    indcol = 1 + col;
                    System.out.println("Coordinates of the number five is (" + indrow + ", " + indcol + ")\n");
                }// end if
            }//end inner for loop
        }//end outer for loop

        for ( int[] row : ranNum )
        {

            for ( int num : row )
            {
                System.out.print( num + "  ");
            }//end inner for loop
            System.out.println("\n");
        }//end outer for loop

    }// end method main
}// end class Array2D1