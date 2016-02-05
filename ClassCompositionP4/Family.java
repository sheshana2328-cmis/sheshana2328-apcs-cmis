import java.util.ArrayList;

public class Family
    {
     public static void main ( String[] args)
        {
        ArrayList<String> myFamily = new ArrayList<String>();
        
        myFamily.add("Palitha Jayasekera");
        myFamily.add("Chitrani Jayasekera");
        myFamily.add("Shehara Jayasekera");
        myFamily.add("Shehan Jayasekera");
        myFamily.add("Sheshana Jayasekera");
        
        System.out.println("The number of family members: " + myFamily.size() + "\n\nWith a For-Loop:\n");
        
        for (int i = 0; i < myFamily.size(); i++)
            {
                System.out.println(myFamily.get(i));
            }
            
        System.out.println("\n\nFor-Each:\n"); 
       
        for ( String x : myFamily )
            {
                System.out.println(x);
            }
        }//end method main
    }//end class Family