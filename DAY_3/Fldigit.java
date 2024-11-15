
import java.util.Scanner;

class Fldigit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,ld,fd;
        System.out.print("Enter a number: ");
        n= sc.nextInt();
        ld = n % 10;
        fd = n;
        while (fd >= 10) 
        {
            fd /= 10;
        }
        System.out.println("First digit: " + fd);
        System.out.println("Last digit: " + ld);
    }
}