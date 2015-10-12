public class BackpackDriver
    {
        public static void main ( String[] agrv )
            {
                Backpack Backpack1 = new Backpack();
                Backpack Backpack2 = new Backpack("Maroon", 25.69);
                
                System.out.println(Backpack1 + "\n\n" + Backpack2);
                
            }//end method main
    } //end class BackpackDriver