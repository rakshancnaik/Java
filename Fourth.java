import java.util.Scanner;
class doublesep
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the first number\n");
int a=obj.nextInt();
System.out.println("Enter the second number\n");
int b=obj.nextInt();
System.out.println("Enter the third number\n");
int c=obj.nextInt();
if(a>b && a>c)
{
System.out.println("a is the largest number");
{
if(b>c)
{
System.out.println("b is the second largest number");
}
else
{
System.out.println("c is the second largest number");
}
}
}
if(b>a && b>c)
{
System.out.println("b is the largest number");
{
if(a>c)
{
System.out.println("a is the second largest number");
}
else
{
System.out.println("c is the second largest number");
}
}
}
else
{
System.out.println("c is the largest number");
{
if(b>a)
{
System.out.println("b is the second largest number");
}
else
{
System.out.println("a is the second largest number");
}
}
}
}
}