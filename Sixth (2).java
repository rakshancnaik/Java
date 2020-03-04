import java.util.Scanner;
class doublesep
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number\n");
int a=obj.nextInt();
int i;
int temp=(a%10);
if (temp==0)
System.out.println("The last digit is zero");
if (temp==1)
System.out.println("The last digit is one");
if (temp==2)
System.out.println("The last digit is two");
if (temp==3)
System.out.println("The last digit is three");
if (temp==4)
System.out.println("The last digit is four");
if (temp==5)
System.out.println("The last digit is five");
if (temp==6)
System.out.println("The last digit is six");
if (temp==7)
System.out.println("The last digit is seven");
if (temp==8)
System.out.println("The last digit is eight");
if (temp==9)
System.out.println("The last digit is nine");
}
}