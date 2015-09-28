import javax.swing.JOptionPane;

public class WeatherChoas 
    {
        public static void main ( String[] argv )
            {
                String input = JOptionPane.showInputDialog("Enter an integer between 1 - 31:");
                
                int inp = Integer.parseInt(input);
                int[] temp = new int[inp];
                int swing;
                int day;
                String des;
               
                int min = 99;
                int max = 0;
                int MinDay = 0;
                int MaxDay = 0;
                
                if (inp <= 31 && inp >= 1)
                {
                    System.out.println("Days" + "\tTemp" + "\tSwing" + "\tDescription" + "\n");
                    
                    for ( int i = 0; i < inp; i++ )
                    {
                        int x = (int) (Math.random()*200)-100;
                        temp[i] = x;
                        day = i+1;
                        des = " ";
                        
                        
                        
                        if ( i > 0 )
                            {
                                swing = Math.abs(temp[1] - temp[i-1]);
                            }
                        else 
                            {
                                swing = 0;
                            }
                        if ( x < 0 )
                            {
                              des = "freezing";    
                            }
                        if ( x > 0 && x < 15 )
                            {
                             des = "chilly";
                            }
                        if ( x > 16 && x < 30 )
                            {
                             des = "comfortable";
                            }
                        if ( x > 31 && x < 40 )
                            {
                             des = "hot";
                            }
                        if ( x > 40 )
                            {
                              des = "AAAAAUUUUHGHHH!";
                            }
                        System.out.println(day + "\t" + temp[i] + "\t" + swing + "\t" + des );
                        
                        if ( x < min )
                            {
                                min = x ;
                                MinDay = day;
                             }
            
                        if ( x > max )
                             {
                                 max = x;
                                 MaxDay = day;
                              }
                    }
                    
                    System.out.println("\nMax: Temp " + max + " on day:" + MaxDay + "\nMin: Temp" + min + " on day:" + MinDay);
            

                    }// end if
                else
                {
                    System.out.println("That is not a valid number of days!");
                }// end else
            }// end method main
    }// end class WeatherChoas
         