
import java.util.Scanner;
 class Fibonacci {
  
    public static void main(String[] args) 
    {
     
         int n, first = 1,next = 2;
          
            System.out.println("Enter how many series of fibonacci  ");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
        
            for (int i = 1; i<=n-2; ++i)
            {
                int sum = first + next;
                first = next;
                next = sum;
                System.out.print(" " + sum);
            }
  
    }
  
}
