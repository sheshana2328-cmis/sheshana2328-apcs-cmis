import java.util.Scanner;

public class HelloMath
    {
    public static void main( String[] args )
        {
         Scanner input = new Scanner( System.in );
         
         System.out.println( "Enter your first number:" );
         int n1 =input.nextInt();
         
         System.out.println( "Enter your second number:" );
         int n2 =input.nextInt();
         
         System.out.println (n1 + n2);
         System.out.println (n1 - n2);
        
            
        }
    }