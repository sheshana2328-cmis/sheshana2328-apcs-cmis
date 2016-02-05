public class Array2d1
    {
        public static void main (String[] argv) 
            {
                int[][] ranNum = new int[3][4];
                
                for ( int row = 0; row < ranNum.length; row++)
                    {
                       for ( int col = 0; col < ranNum[0].length; col++)
                        {
                            ranNum[row][col] = (int)(Math.random()*10);
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