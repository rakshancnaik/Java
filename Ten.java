import java.util.Scanner;
class doublesep
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int i,fact=1;
System.out.println("Enter the closing value of the range \n");
int n=obj.nextInt();
for(i=n;i>=1;i--)
{
fact=fact*i;
}
System.out.println("The factorial value of the number is "+ fact);
}
}