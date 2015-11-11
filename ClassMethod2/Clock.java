public class Clock
    {
     private int hours;
     private int mins;
     private int secs;
     
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
        
     public void setTime(int hours, int mins, int secs)
        {
            this.hours = hours;
            this.mins = mins;
            this.secs = secs;
        }
     
     public String toString()
        {
         String output = new String();
         output = "says " + hours + ":" + mins + ":" + secs;
         return output;
        }
    } //end class Clock