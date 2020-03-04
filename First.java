import java.util.Scanner;
class doublesep
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number\n");
double n= obj.nextDouble();
int a=(int)n;
double res=n-a;
System.out.println("The value is "+a);
System.out.println("The value is "+res);
}
}