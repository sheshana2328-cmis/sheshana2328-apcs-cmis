import javax.swing.JOptionPane;

public class TestOneRetry
    {
        public static void main ( String[] args )
            {
                String input = JOptionPane.showInputDialog("Enter Integer:");
                int number = Integer.parseInt(input);
                String[] index = new String[number];
                double[] numb = new double[number];
                String[] lett = new String[number];
                
                for ( int x = 0; x<number; x++ )
                    {
                        index[x] = x + ":";
                        numb[x] = (Math.random()*49+1);
                        lett[x] = "" ;
                        if ( (int)numb[x] %2 == 0)  
                            {
                                for(int y = 0; y<numb[x]; y++)
                                    {
                                        lett[x] += "E";
                                    }
                            }
                        else 
                            {
                                for (int y =  0; y<numb[x]; y++)
                                    {
                                        lett[x] += "O";
                                    }
                            }
                    }
                for (int x =0; x<number; x++)
                    {
                        System.out.println( index[x] + numb[x]);
                    }
                int z = number-1; 
                while (z>=0)
                    {
                        System.out.println(index[z] + lett[z] + numb[z]);
                        z--;
                    }
                
             }
    } //end class TestOneRetry