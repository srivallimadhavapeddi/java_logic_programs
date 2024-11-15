
import java.util.Scanner;
class Reverse
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,r=0,digit;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while (n != 0) 
        {
            digit = n % 10; 
            r = r * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed number: " + r);
    }
}