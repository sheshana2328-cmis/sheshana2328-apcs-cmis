public class Ipod extends MyDevice
    {
        private int songs;
        
        public Ipod()
            {
              super();
              this.songs = 12;
            }
            
        public Ipod( int memory, boolean condition, int songs)
            {
             super ( memory, condition );
             this.songs = songs;
            }
           
        public void setNumSongs( int songs )
            {
                this.songs = songs;
            }
            
            
        public String toString()
            {
                String output = new String();
                output = super.toString() + "The number of songs on this device is: " + songs + "\n";
                return output;
            }
    }//end public class MyDevice