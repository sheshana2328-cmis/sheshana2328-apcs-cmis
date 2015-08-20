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
         
         String out1 = Integer.toString(n1);
         String out2 = Integer.toString(n2);
         
         System.out.println (out1 "+" out2);

        
            
        }
    }