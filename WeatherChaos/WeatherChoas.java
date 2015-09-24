import javax.swing.JOptionPane;

public class WeatherChoas
    {
        public static void main ( String[] argv )
            {
                String input = JOptionPane.showInputDialog("Enter an integer between 1 - 31:");
                
                int inp = Integer.parseInt(input);
                int x;
                int y;
                
                int[] numdays = new int[inp];
                int[] swing = new int[inp];
                String headings;
                //x = (int) (Math.random()*200)-100;
                
                //String addto; 
                String[] heading = {"day","temp","swing","description"};
                
                if ( inp >= 1 && inp <= 31 )
                {
                   for (int i = 0; i < heading.length; i++)
                    {
                        System.out.print(heading[i]+ "\t");
                    }
                    System.out.println("\n");
                    for (int i = 0; i < inp; i++ )
                    {
                      System.out.println(i+1);
                      x = (int) (Math.random()*200)-100;
                        System.out.print(x + "\t\t\t");
                        if ( x < 0 )
                        {
                            System.out.println("freezing");
                        }
                        if ( x > 0 && x < 15 )
                        {
                            System.out.println("chilly");
                        }
                        if ( x > 16 && x < 30 )
                        {
                            System.out.println("comfortable");
                        }
                        if ( x > 31 && x < 40 )
                        {
                           System.out.println("hot");
                        }
                        if ( x > 40 )
                        {
                            System.out.println("ARGHHH");
                         }
                   }
                    System.out.println("\n"); //i put a line to seperate for now
                    
                   
                   /*for ( int i = 0; i < inp; i++ ) // for description
                    {
                        x = (int) (Math.random()*200)-100;
                        System.out.print(x + "\t\t\t");
                        if ( x < 0 )
                        {
                            System.out.println("freezing");
                        }
                        if ( x > 0 && x < 15 )
                        {
                            System.out.println("chilly");
                        }
                        if ( x > 16 && x < 30 )
                        {
                            System.out.println("comfortable");
                        }
                        if ( x > 31 && x < 40 )
                        {
                           System.out.println("hot");
                        }
                        if ( x > 40 )
                        {
                            System.out.println("ARGHHH");
                         }
                    }*/
                }
                else 
                {
                    System.out.println("That's not a valid number of days!");
                }
                } // end 
            } // end 
