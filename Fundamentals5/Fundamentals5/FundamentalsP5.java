public class FundamentalsP5
    {
     public static void main ( String[] args )
        {
            String fm1 = "The Shining";
            String fm2 = "Hot Fuzz";
            String fm3 = "Ender's Game";
            String fs1 = "Letting in";
            String fs2 = "Me";
            String fs3 = "Thirteen Thirtyfive";
            
            String movies[] = {fm1, fm2,fm3};
            for (int index = 0; index<movies.length; index++ )
            {
                System.out.println(movies[index]);
            } //end for
            {
                System.out.print("\n\n");
            }
            
            String songs[] = {fs1, fs2, fs3};
            
            int song = 0;
            
            while (song<songs.length)
            {
                System.out.print(songs[song] + ", " );
                song ++;
            } //end while
        } // end main
    } // end class