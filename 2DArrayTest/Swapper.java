public class Swapper
{
    public static void main ( String[] args )
    {
        /*
         * In the 2d array of integers below, find the row and the column with the highest product (disregard any zeros).
         * Then, find the value at the intersection of that row and column.
         * Then, swap all occurances of that value in the array for zero and all occurances of zero in the array for that value.
         * Print out the grid.
         * 
         * For example, if row 4 and column 5 have the largest products, the value at the intersection would be 7.
         * Then you would swap all 7s for 0s and 0s for 7s. The result would be this:
         * 9 7 2 5 7 9 7 5 8 5
         * 4 8 1 0 7 5 3 6 2 7
         * 0 0 5 6 7 5 6 6 4 7
         * 5 1 6 2 2 2 7 9 1 9
         * 7 0 8 9 7 0 4 3 8 6
         * 1 7 5 6 3 2 9 3 5 3
         * 5 3 1 4 9 9 1 3 4 8
         * 5 6 9 9 0 8 0 3 9 3
         * 1 7 4 8 3 1 7 2 1 5
         * 1 0 3 6 3 0 8 3 3 6
         */
        int productrow = 0;
        int productcol = 0;
        int indexcol;
        int indexrow;
        int amountrow = 1;
        int amountcol = 1;
        
        
        int[][] grid = new int[][] {{9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                                    {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                                    {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                                    {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                                    {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                                    {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                                    {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                                    {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                                    {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                                    {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};
        
                                    //         for ( int row = 0; row < grid.length; row++)
                                    //                     {
                                        //                      amountrow *= grid[row];
                                        //                     }           
                        
        for ( int row = 0; row < grid.length; row++ )
            {
                for ( int i = 0; i < row; i++) 
                    {
                        if ( grid[row][i] != 0  )
                            {
                                amountrow = amountrow * i;
                                if ( amountrow > productrow )
                                 {
                                     productrow = amountrow;
                                     grid[row][i] = indexrow;
                                    }
                            }
                    }
                System.out.println(amountrow);
                //if ( amountrow > productrow )
                  //  {
                    //    productrow = amountrow;
                      //  grid[row][] = indexrow;
                    //}
            }
            
            System.out.println("\n");
            
        for ( int col = 0; col < grid[0].length; col++ )
            {
                for ( int i = 0; i < col; i++) 
                    {
                        if ( grid[col][i] != 0  )
                            {
                                amountcol = amountcol * i;
                            }
                    }
                System.out.println(amountcol);
                if ( amountcol > productcol )
                    {
                        productcol = amountcol;
                        grid[0][col] = indexcol;
                    }
            }
            
        for ( int col = 0; col < grid[0].length; col++ )
            {
                for ( int i = 0; i < col; i++) 
                    {
                        if ( grid[col][i] != 0  )
                            {
                                amountcol = amountcol * i;
                            }
                    }
                System.out.println(amountcol);
            }
            
        int valofinter = grid[indexrow][indexcol];
        
        for ( int row = 0; row < grid.length; row++)
                    {
                       for ( int col = 0; col < grid[0].length; col++)
                        {
                            if ( grid[row][col] == valofinter )
                                {
                                    grid[row][col] = 0;
                                }
                            if ( grid[row][col] == 0 )
                                {
                                    grid[row][col] = valofinter;
                                }
                        }//end inner for loop
                    }//end outer for loop
            
    }
}