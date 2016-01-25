public class Multiples
    {
        public static void main (String[] argv)
            {
                int length = 1000;
                int sum = 0;
                int[] num = new int[length];
                
                for ( int i = 0; i < num.length; i++ )
                    {
                        if (i % 3 == 0 || i % 5 == 0)
                            { 
                               sum += i;
                               System.out.println(i +"    " + sum); 
                            }
                    }
  
            } // end method main
    } // end class Multiples
    