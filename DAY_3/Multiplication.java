
import java.util.Scanner;
class Multiplication 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=1,n;
        System.out.println("Enter n value");
        n=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+i*n);
        }
    }
}