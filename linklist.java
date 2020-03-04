import java.util.*;
import java.util.LinkedList;
public class linklist 
{
public static void main(String arg[])
{
	LinkedList l =new LinkedList();
	l.add(4);
	l.add(2);
	l.add(1);
	l.add(3);
	System.out.println(l);
	l.addFirst(0);
	System.out.println(l);
	l.addLast(10);
	System.out.println(l);
	ListIterator li=l.listIterator();
	int counter=0;
	while(li.hasNext())
	{
		System.out.println("Element [+ counter+]="+li.next());
		System.out.println("-hasPrevious="+li.hasPrevious());
		System.out.println("-hasNext="+li.hasNext());
		System.out.println("-previousIndex="+li.previousIndex());
		System.out.println("-nextIndex="+li.nextIndex());
		System.out.println();
		counter++;
	}
	}
}
