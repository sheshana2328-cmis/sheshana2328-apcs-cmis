public class Grad extends Student
   {
    public Grad(String firstname, String major, int units)
       {
        super(firstname, major, units);   
       } // end constructor
       
    public int calculateTuition()
       {
        return  getunits()* 500;    
       } // end caltuition
       
    public String toString()
       {
        return super.toString();  
       } // end toString 
       
    
   } // end class 