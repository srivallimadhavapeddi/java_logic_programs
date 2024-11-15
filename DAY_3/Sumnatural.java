

import java.util.Scanner;
class Sumnatural
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=1,n,sum=0;
        System.out.println("Enter the value");
        n=sc.nextInt();
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("The Number is:"+i);
    }
}
