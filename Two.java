import java.util.Scanner;
class doublesep
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the first number");
int a=obj.nextInt();
System.out.println("Enter the second number");
int b=obj.nextInt();
System.out.println("Enter the third number");
int c=obj.nextInt();
int res=((a>b)?(+a):(+b));
int res1=((res>c)?res:(+c));
System.out.println("The largest number is "+res1 );
}
}