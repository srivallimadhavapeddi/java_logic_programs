
import java.util.Scanner;

class Sumd
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n,sum=0,digit;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while (n != 0) 
        {
            digit = n % 10; 
            sum += digit;   
            n /= 10;   
        }
       System.out.println("Sum of digits: " + sum);
    }
}