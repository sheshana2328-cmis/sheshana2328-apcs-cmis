public class Song
    {
     //1. Create Instant Variable
     
     private int yearReleased;
     private int length; //min in sec
     private int sec;
     //private int min;
     private int views;
     private String title;
     
     //2. Write constructor to initialize instance variables
     public Song()
        {
         title = new String("Communist Daughter");
         views = 106034;
         length = 121;
         yearReleased = 1997;
        }// end constructor Song
        
     public int getYearReleased()
        {
            return yearReleased;
        }
        
     public void setYearReleased( int year )
        {
            this.yearReleased = year;
        }
        
     public Song( String title, int views, int length, int yearReleased )
        { 
            this.title = new String( title );
            this.views = views;
            this.length = length;
            this.yearReleased = yearReleased;
        }
        
     public String convertToMinSec()
        {
             int min = length/60;
             int sec = length%60;
             String minsec = "The song is " + min + " minutes and " + sec + " seconds in length.";
             return minsec;
        }
     //3. toString()
     public String toString()
        {
         String output = new String();
         output = "Title: " + title + "\n" +
                  "Views: " + views + "\n" +
                  "Year Released: " + yearReleased + "\n" 
                 + convertToMinSec();  
         return output;       
        }// end method toString()
        
    }// end class Song