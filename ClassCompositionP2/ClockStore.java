public class ClockStore
    {
        private Clock clocksInStock[];
        
        public ClockStore()
            {
                this.clocksInStock = new Clock[3];
                clocksInStock[0] = new Clock(12, 34, 21);
                clocksInStock[1] = new Clock(9, 12, 54);
                clocksInStock[2] = new Clock(18, 56, 11);
            }
            
        public Clock mostSeconds()
            {
                int ClockIndex = 0;
                int ClockSec = 0;
                
                
                for ( int i = 0; i < clocksInStock.length; i++ )
                    {
                        if(clocksInStock[i].totalSeconds() > ClockSec )
                            {
                                ClockSec = clocksInStock[i].totalSeconds();
                                ClockIndex = i;
                            }                        
                    }
                return clocksInStock[ClockIndex];
            }
            
        public String toString()
            {
                String output = new String();
                output = "THE CLOCKS IN STOCK ARE:\n\n" + 
                         clocksInStock[0] + "\n" +
                         clocksInStock[1] + "\n" +
                         clocksInStock[2] + 
                         "\n\nThe clock with the most seconds is: \n\n" + mostSeconds();
                return output;
            }
        
    }//end class ClockStore