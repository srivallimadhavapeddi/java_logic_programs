
import java.util.Scanner;

class Muld
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,sum=1,digit;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while (n != 0) 
        {
            digit = n % 10; 
            sum = sum * digit;   
            n /= 10;   
        }
       System.out.println("Sum of digits: " + sum);
    }
}