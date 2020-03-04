
public class Test5 {
interface MyFunctionalInterface 
{
public string sayhello();
}
public class Test{
	public static void main(String args[])
	{
		MyFunctionalInterface msg = () -> {
			return "Hello";
		};
	}System.out.println(msg.sayhello("tilaka"));
}
}
