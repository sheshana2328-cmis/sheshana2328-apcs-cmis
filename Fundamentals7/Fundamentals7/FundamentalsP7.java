public class FundamentalsP7
    {
        public static void main ( String[] args )
            {
             int[] ar = new int[10];
             int neg = 0;
             int pos = 0;
             
             for ( int index = 0; index < ar.length; index++ )
                {
                    int ran = 0;
                    
                    ran = (int) (100*Math.random());
                    if (ran % 2 == 0)
                        {
                            ar[index] = ((int)(100*(-1)*Math.random()));
                            neg++;
                        }
                    else{
                        ar[index]=((int)(100*Math.random()));
                        pos++;
                        }
                }
             int index = 0;
             while ( index < ar.length)
                {
                    System.out.println(ar[index] + " " );
                    index++;
                }
             System.out.println("There are " + pos + " positive numbers.");
             for (int ran = 0; ran < ar.length; ran++)
                {
                    if(ar [ran] > 0)
                        {
                            System.out.print(ar[ran] + "\t");
                        }
                }
            } // end method main
    } // end class
