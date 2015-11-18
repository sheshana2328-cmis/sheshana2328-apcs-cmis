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
        
     public String totalSeconds()
        {
            hours *= 3600; 
            mins *= 60;
            total = mins + hours + secs;
            String totalsec = "Total Seconds: " + total;
            return totalsec;
        }
     
     public void setTime( int hours, int mins, int secs )
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
         output = "says " + hours + ":" + mins + ":" + secs + "\n" +
                  totalSeconds() + "\n\n" + convertDaylightSavings();
         return output;
        }
    } //end class Clock