public class University 
    {
       public static void main (String[] args)
        {
            String unione = new String("Kent");
            String unitwo = new String("Sussex");
            String unithree = new String("Queens");
            
            System.out.println( unione.compareTo( unitwo )); 
            System.out.println( unione.compareTo( unithree )); 
            System.out.println( unitwo.compareTo( unione )); 
            System.out.println( unitwo.compareTo( unithree )); 
            System.out.println( unithree.compareTo( unitwo )); 
            System.out.println( unithree.compareTo( unione )); 
            
        }// end method main
    }// end class university
    
   /* Questions:
      a.) The compareTo() method compares the first letter of the first word to the first letter of the second word in the alphabet. 
      b.) compareTo() will move on to the second letter and compare that instead.
   */