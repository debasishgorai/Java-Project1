package CollectionFrameWork;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo6 {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	ListIterator i=a.listIterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	while(i.hasPrevious())
	{
		System.out.println(i.previous());
	}
}

}
