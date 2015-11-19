public class Clock
    {
     private int hours;
     private int mins;
     private int secs;
     private int total;
     
     public Clock()
        {
         hours = 15;
         mins = 45;
         secs = 23;
        }// end constructor Clock
        
     public Clock(int hours, int mins, int secs)
        {
         this.hours = hours;
         this.mins = mins;
         this.secs = secs;
        }// end three-argv constructor
     
     public String convertDaylightSavings()
        {
            hours += 1;
            String convertDaylightSavings = "\n\nSpringing Forwards!\n\nNow the clock says: " + hours + ":" + mins + ":" + secs ;
            return convertDaylightSavings;
        }   
        
     public String totalSeconds()
        {
            hours *= 3600; 
            mins *= 60;
            total = mins + hours + secs;
            String totalsec = "Total Seconds: " + total;
            return totalsec;
<<<<<<< HEAD
        }
     
     public void setTime( int hours, int mins, int secs )
=======
        }  
        
     public void setTime()
>>>>>>> 3c6121feab8007dd18725ea6fbbcc4139da795d2
        {
            this.hours = hours;
            this.mins = mins;
            this.secs = secs;
        }   
        
     public String convertDaylightSavings()
        {
            hours += 1;
            String convertDaylightSavings = "says " + hours + ":" + mins + ":" + secs + "\n" +
                                            totalSeconds();
            return convertDaylightSavings;
        }  
     
     public String toString()
        {
         String output = new String();
<<<<<<< HEAD
         output = "says " + hours + ":" + mins + ":" + secs + "\n" +
                  totalSeconds() + "\n\n" + convertDaylightSavings();
=======
         output = "says " + hours + ":" + mins + ":" + secs + "\n" + totalSeconds() +
                  convertDaylightSavings() + "\n" + totalSeconds();
>>>>>>> 3c6121feab8007dd18725ea6fbbcc4139da795d2
         return output;
        }
    } //end class Clock