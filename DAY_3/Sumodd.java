
import java.util.Scanner;
class Sumodd  
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=1,n,sum=0;
        System.out.print("Enter the value: ");
        n =sc.nextInt();
        for (i = 1; i <= n; i++) 
        {
            
            if (i % 2 == 1) 
            {
                sum = sum + i;
            }
        }
        
      
        System.out.println("The sum of all odd numbers is: " + sum);
        
       
    }
}