import java.util.ArrayList;

public class MyDeviceDriver
{
    public static void main (String[] argv)
    {
        Ipod FirstGen = new Ipod(18, true, 239);
        System.out.println(FirstGen);
        
        FirstGen.setNumSongs(412);
        
        iGame SecGen = new iGame(64, false, 6, "Dear Esther");
        System.out.println(SecGen);
        
        SecGen.setGame("Fallout 4");
        SecGen.setNum(18);
        
        
        System.out.println("========================================================\n");

        ArrayList<MyDevice> inventory = new ArrayList<MyDevice>();
        inventory.add(FirstGen);
        inventory.add(SecGen);
        
        for(MyDevice d : inventory)
           {
           System.out.println(d);    
               
           }
    }//end method main 
}//end class MyDeviceDriver
