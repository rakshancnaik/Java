import java.util.*;
public class HashSetDemo 
{
	public static void main(String arg[])
	{
		Set hs=new HashSet();
		hs.add("Sandeep");
		hs.add("Tilaka");
		hs.add("Deepak");
		hs.add("Elan");
		hs.add(null);
		hs.add("Chithra");
		hs.add("Tilaka");
		hs.add("Elan");
		System.out.println(hs);
	}

}
