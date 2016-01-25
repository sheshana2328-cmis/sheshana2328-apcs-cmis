import javax.swing.JOptionPane;

public class Fibonacci
    {
        public static void main (String[] args)
            {
                String input = JOptionPane.showInputDialog( "Give me a number:" );
                int num = Integer.parseInt(input);
                long[] seq = new long[num];
                seq[0] = 1;
                seq[1] = 2;
                long count = 0;
                for (int i = 2 ; i < seq.length; i++)
                    {
                    long n = seq[i-1] + seq[i-2];
                    seq[i] = n;
                    System.out.println(i + ": " + seq[i]);
                    }
                for (int i = 0; i < seq.length; i++)
                    {
                    if (seq[i] % 2 == 0)
                        {
                        count += seq[i];
                        }
                    }//end for
                System.out.println("\n\n" + count);
            } //end method main
    } //end class Fibonacci