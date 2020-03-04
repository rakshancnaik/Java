import java.util.Scanner;
class doublesep
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int i,sum=0;
System.out.println("Enter the opening value of range\n");
int n=obj.nextInt();
System.out.println("Enter the closing value of range\n");
int m=obj.nextInt();
for(i=n;i<=m;i++)
{
if(i<2)
{
sum=0;
}
if (i==2)
{
System.out.print("2 ");
}
if (i==3)
{
System.out.print("3 ");
if(n==2)
{
sum=5;
}
else
{
sum=3;
}
}
if (i==5)
{
System.out.print("5 ");
if(n==2)
{
sum=10;
}
if(n==3||n==4)
{
sum=8;
}
if(n==5)
{
sum=5;
}
}
if(i==7)
{
System.out.print("7 ");
if(n==2)
{
sum=17;
}
if((n==3)||(n==4))
{
sum=15;
}
if(n==5)
{
sum=12;
}
if((n==6)||(n==7))
{
sum=7;
}
}
if (i>7)
{
if((i%2==0)||(i%3==0)||(i%4==0)||(i%5==0)||(i%7==0))
{
}
else
{
System.out.print(i);
System.out.print(" ");
sum=sum+i;
}
}
}
System.out.print("The sum is"+sum);
}
}