import java.util.Scanner;
class doublesep
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the name\n");
String name=obj.nextLine();
System.out.println("Enter the marks in first subject out of 100\n");
int one=obj.nextInt();
System.out.println("Enter the marks in second subject out of 100\n");
int two=obj.nextInt();
System.out.println("Enter the marks in third subject out of 100\n");
int three=obj.nextInt();
int Total=one+two+three;
double Average=(double)(Total/3);
System.out.println("Total marks is "+Total);
System.out.println("Average marks is"+Average);
if (Average>69)
{
System.out.println("First Class");
}
else if(Average>28 && Average<70)
{
System.out.println("Second Class");
}
else
{
System.out.println("Fail");
}
}
}