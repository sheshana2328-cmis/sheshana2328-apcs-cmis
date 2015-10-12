public class Song
    {
     //1. Create Instant Variable
     
     private double length;
     private int views;
     private String title;
     
     //2. Write constructor to initialize instance variables
     public Song()
        {
         title = new String("Communist Daughter");
         views = 106034;
         length = 2.01;
        }// end constructor Song
        
     public Song( String title, int views, double length )
        {
            this.title = new String( title );
            this.views = views;
            this.length = length;
        }
     //3. toString()
     public String toString()
        {
         String output = new String();
         output = "Title: " + title + "\n" +
                  "Views: " + views + "\n" +
                  "Length: " + length;  
         return output;       
        }// end method toString()
        
    }// end class Song