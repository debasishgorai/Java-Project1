package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo5 {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
//	a.add(10);
//	a.add(20);
//	a.add(30);
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	a.add(6);
	System.out.println(a);
	Iterator i=a.iterator();
	while(i.hasNext())
	{
		Integer n=(Integer)i.next();
		if(n%2!=0) i.remove();
		//System.out.println(i.next());
	}
	System.out.println(a);
}

}
