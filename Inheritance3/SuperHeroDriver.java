
import java.util.ArrayList;

public class SuperHeroDriver
   {
    public static void main(String[] args)
       {
        AsteroidMan Ben = new AsteroidMan();
        FriedEggMan John = new FriedEggMan();
        ThatGuy Bob = new ThatGuy();
        
        Ben.setSuitColor("Purple");
        John.setSuitColor("Maroon");
        Bob.setSuitColor("Gray");
        
        Ben.setCape(false);
        John.setCape(false);
        Bob.setCape(true);
        
        Ben.setName("Asteroid Man");
        John.setName("Fried Egg Man");
        Bob.setName("That Guy");
        
        ArrayList<SuperHero> inventory = new ArrayList<SuperHero>();
        inventory.add(Ben);
        inventory.add(John);
        inventory.add(Bob);
        
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        System.out.println("\nOriginal set of ArrayList Heroes... ");
        int i = 0;
        
        for(SuperHero S : inventory)
           {
            System.out.println(S);  
           } // end for-each
           
        for(int row = 0; row < capedHeroes.length; row++)
           {
            for(int col = 0; col < capedHeroes[0].length; col++)
               {
                if(i < inventory.size())
                   {
                    if(inventory.get(i).isCaped() == true)
                       {
                        capedHeroes[row][col] = inventory.get(i);
                        inventory.remove(inventory.get(i));
                       }// end if 
                       
                    else
                       {
                        i++;   
                       }
                   }// end if
               } // end col
           } // end row
           
        System.out.println("\nPrinting 2D Array capedHeroes... ");        
        for(int row = 0; row < capedHeroes.length; row++)
           {
            for(int col = 0; col < capedHeroes[0].length; col++)
               {
                if(capedHeroes[row][col] != null)
                   {
                    System.out.print(capedHeroes[row][col].getName() + "\t\t");
                   }// end if
                else
                   {
                    System.out.print(capedHeroes[row][col] + "\t\t");   
                   } // end else
                i++;
               } // end col
            System.out.println();
           } // end row
           
        System.out.println("\nPrinting contents of capedHeroes... ");
        for(int row = 0; row < capedHeroes.length; row++)
           {
            for(int col = 0; col < capedHeroes[0].length; col++)
               {
                if(capedHeroes[row][col] != null)
                   {
                    System.out.println(capedHeroes[row][col] + "\t\t");
                    i++;
                   }// end if
               } // end col
           } // end row
           
        System.out.println("\nRemaining set of ArrayList heroes... ");
        for(SuperHero X : inventory)
           {
            System.out.println(X);
           } // end for each
        
       } // end void main
       
   } // end driver