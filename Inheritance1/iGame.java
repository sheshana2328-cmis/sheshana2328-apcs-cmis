public class iGame extends MyDevice
    {
        private int games;
        private String mostplayedgame;
        
        public iGame()
            {
              super();
              this.games = 4;
              this.mostplayedgame = "The Last of Us";
            }
            
        public iGame( int memory, boolean condition, int games, String mostplayedgame)
            {
             super ( memory, condition );
             this.games = games;
             this.mostplayedgame = mostplayedgame;
            }
            
        public String getMostPlayed()
            {
                return mostplayedgame;
            }
            
        public void setGame( String mostplayedgame )
            {
                this.mostplayedgame = mostplayedgame;
            }
            
        public void setNum( int games )
            {
                this.games = games;
            }
            
        public String toString()
            {
                String output = new String();
                output = super.toString() + "The number of games on this device is: " + games + 
                        "\nThe most played game on this device currently: " + mostplayedgame + "\n";
                return output;
            }
    }//end public class MyDevice