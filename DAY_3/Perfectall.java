
import java.util.Scanner;

class Perfectall 
    {
    public static boolean isPerfect(int number)
      {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++)
          {
            if (number % i == 0)
            {
                sum += i; // Add the divisor to the sum
            }
        }
        
        return sum == number;
    }

    public static void main(String[] args)
       {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();
        
        System.out.println("Perfect numbers between 1 and " + n + " are:")
        for (int i = 1; i <= n; i++)
         {
            if (isPerfect(i)) 
             {
                System.out.print(i + " "); 
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}