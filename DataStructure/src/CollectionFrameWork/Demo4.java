package CollectionFrameWork;

import java.util.*;
public class Demo4 {
public static void main(String[] args) {
	SortedSet s=new TreeSet();
	s.add(50);
	s.add(30);
	s.add(10);
	s.add(60);
	s.add(40);
	s.add(20);
	System.out.println(s.first());
	System.out.println(s.last());
	SortedSet s1=s.headSet(40);
	display(s1);
	SortedSet s2=s.tailSet(40);
	display(s2);
}
public static void display(Set s)
{
	for(Object o:s)
	{
		System.out.println(o+" ");
	}
	System.out.println();
}

}
