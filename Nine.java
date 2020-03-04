import java.util.Scanner;
class doublesep
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);

int i;
System.out.println("Enter the number\n");
int a=obj.nextInt();
int b=a;
int c=1;
while(b>9)
{
b=(int)(b/10);
c++;
}
int arr[]=new int[c];
for(i=0;i<c;i++)
{
arr[i]=a%10;
a=a/10;
}
System.out.println("The reversed number is\n");
for(i=0;i<c;i++)
{
int d=arr[i];
System.out.print(d);
}
}
}