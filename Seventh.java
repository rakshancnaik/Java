import java.util.Scanner;
class doublesep
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the character\n");
char word=obj.next().charAt(0);
if(word=='A'||word=='E'||word=='I'||word=='O'||word=='U'||word=='a'||word=='e'||word=='i'||word=='o'||word=='u')
{
System.out.println("The entered alphabet is vowel");
}
else
{
System.out.println("The entered alphabet is consonant");
}
}
}