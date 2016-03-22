public class UnderGrad extends Student
   {
    public UnderGrad(String firstname, String major, int units)
       {
        super(firstname, major, units);   
       } // end constructor
       
    public int calculateTuition()
       {
        return getunits()*250;    
       } // end caltuition
       
    public String toString()
       {
        return super.toString();  
       } // end toString 
       
    
   } // end class 