import java.util.Scanner;
class doublesep
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number\n");
int num=obj.nextInt();
String result=((num%2)==0)?"Even":"Odd";
System.out.println("The number is: " +result);
}
}