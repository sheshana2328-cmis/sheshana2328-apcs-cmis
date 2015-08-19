import java.util.Scanner;

public class HelloUsersAge
        {
        public static void main ( String [] args )
            {
             System.out.println( "What is your name?" );
                
             Scanner input = new Scanner( System.in );
             String usersname = input.next ();
             
             System.out.println( "How old are you?" );
             
             String usersage = input.next ();
             
             System.out.println("Hello," + usersname + "! You are " + usersage  + " years old.");
             
            } // end method main
        } // end class HelloUsersAge