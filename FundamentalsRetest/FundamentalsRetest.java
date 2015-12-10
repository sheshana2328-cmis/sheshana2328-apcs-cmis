import javax.swing.JOptionPane;

public class FundamentalsRetest
    {
        public static void main ( String[] args )
            {
                String input = JOptionPane.showInputDialog("Enter an integer:");
                int n = Integer.parseInt(input);
                String[] index = new String[n];
                int[] these = new int[n];
                int[] those = new int[n/2];
                
                for ( int i = 0; i < these.length; i++ )
                    {
                        index[i] = i + ":";
                        these[i] = (int) (Math.random()*n);
                        System.out.println(these[i]);
                        for ( int x = n; x >= these.length; x--)
                            {
                                if ( these[i] > these[x] )
                                    {
                                        those[x] = these[i];
                                    }    
                                else if ( these[i] < these[x] )
                                    {
                                        those[x] = these[x];
                                    }
                                else
                                    {
                                        System.out.print("-1 ERROR!!!");
                                    }
                                System.out.println(index[i] + those[x]);
                                }
                    }//end of a for loop
                    
               System.out.println("\n");
               
               //if for if these[x] "<" for the number of time these[x]
               //else
             
               for ( int i = 0; i < those.length; i++ )
                    {
                        //System.out.println(index[i] + those[x]);
                    }
                }//end method main
            } //end class FundamentalsRetest