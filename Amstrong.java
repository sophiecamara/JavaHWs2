
package JavaHW2;
import java.util.Scanner;
class Amstrong {  
      public static void main(String[] args) {

        int num, i, n, sum = 0;
        System.out.println("enter  a number    ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
       
        for(i=num; i!=0; i/=10)
        {
            n = i % 10;
            sum = sum + n*n*n;
        }

        if(sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}