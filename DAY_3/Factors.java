
import java.util.Scanner;

public class Factors 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Enter a number to find its factors: ");
        n = sc.nextInt();

        System.out.println("Factors of " + n + " are:");
        for (i = 1; i <= n; i++) 
        {
            if (n % i == 0) 
            {
                System.out.print(i + " ");
            }
        }
    }
}