public class Song
    {
     //1. Create Instant Variable
     
     private int yearReleased;
     private double length;
     private int views;
     private String title;
     
     //2. Write constructor to initialize instance variables
     public Song()
        {
         title = new String("Communist Daughter");
         views = 106034;
         length = 2.01;
         yearReleased = 1998;
        }// end constructor Song
        
     public int getYearReleased()
        {
            return yearReleased;
        }
        
     public void setYearReleased( int year )
        {
            this.yearReleased = year;
        }
        
     public Song( String title, int views, double length, int yearReleased )
        {
            this.title = new String( title );
            this.views = views;
            this.length = length;
            this.yearReleased = yearReleased;
        }
     //3. toString()
     public String toString()
        {
         String output = new String();
         output = "Title: " + title + "\n" +
                  "Views: " + views + "\n" +
                  "Length: " + length + "\n" +
                  "Year Released: " + yearReleased ;  
         return output;       
        }// end method toString()
        
    }// end class Song