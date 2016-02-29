public class JukeboxDriver
   {
    public static void main(String[] args)
       {
        Jukebox Songs = new Jukebox();
        System.out.println(Songs);
        System.out.println("Currently Playing: " + Songs.randomSong() + "\n");
        System.out.println("Songs with the rating of 2: \n" + Songs.playSongofRating(2));
       }
   } 