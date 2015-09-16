public class EulerProjOne
    {
        public static void main ( String[] args )
            {
                int num = 1000;
                
                int[] multiples = new int[1000];
                
                for(int index= 0; index < num; index++ )
                    {
                        if ( index % 3 == 0)
                            {
                                int sumone = index;
                            }
                        
                        if ( index % 5 == 0)
                            {
                                int sumtwo = index;
                            }
                            int sum = 0;
                        for (int var = 0; var < 1; var++)
                            {
                                System.out.println("Sum:" + (sumone + sumtwo));
                            }
                    }
                    
                int sum = 0;
                
                //for (int index=0; index < 1; index++)
                    //{
                       //sum += multiples[index];
                    //}
                  
                //System.out.println("Sum:" + sum);
                
            } // End Method Main
    } // End Class EulerProjOne