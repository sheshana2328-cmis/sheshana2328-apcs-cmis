public class TelevisionDriver
   {
    public static void main(String[] args)
       {
        Television[] TV = new Television[5];
        TV[0] = new Television("ESharp", 190.00);
        TV[1] = new DLP("Sony DLP", 110.00);
        TV[2] = new LED("Panasonic LED", 230.00);
        TV[3] = new LCD("LG Best", 390.90);
        TV[4] = new Plasma("HP", 1235.24);
    
        for ( Television tv : TV )
           {
            System.out.println(tv);
           }     
       }
   }