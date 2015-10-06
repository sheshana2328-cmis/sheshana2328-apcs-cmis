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
     
     public String toString()
        {
         String output = new String();
         output = "The time is " + hours + ":" + mins + ":" + secs;
         return output;
        }
    } //end class Clock