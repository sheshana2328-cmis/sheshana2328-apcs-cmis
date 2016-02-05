import java.util.ArrayList;

public class Trail
    {
        private ArrayList<Integer> markers = new ArrayList<Integer>(13);
        private int[] ranNum = new int[13];
        
        public Trail()
            {
                for(int i = 0; i < ranNum.length; i++)
                    {
                        ranNum[i] = (int) (Math.random()*99);
                        markers.add(ranNum[i]);    
                        //System.out.println(markers);
                    }
            }
            
        public Trail( ArrayList markers )
            {
                this.markers = markers;
            }
            
        public void addMarker( int NextNum )
            {
                Integer.parseInt(NextNum);
                markers.add(NextNum);
            }
            
        public String toString()
            {
                String output = "Index Elevation\n";
                for (int i = 0; i < ranNum.length; i++)
                    {
                        output += i + " " + ranNum[i] + "\n";
                    }
                return output;
            }
    }//end class GPS