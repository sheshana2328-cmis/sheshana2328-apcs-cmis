public class MySong
    {
        private String title;
        private int rating;
        
        public MySong()
            {
                title = new String("Telephone Song");
                rating = 0;
            } //end constructor Song
        
        public MySong( String title, int rating )
            {
                this.title = title;
                this.rating = rating;
            }// end multi-argument constructor
            
        public int getRating()
            {
                return this.rating;
            }
            
        public void setRating ( int rating )
            {
                this.rating = rating;
            }
            
        public String toString()
            {
                String SongInfo = new String("");
                SongInfo = (title + ", and the song rating is: " + rating);
                return SongInfo;
            }
    }//end class MySong