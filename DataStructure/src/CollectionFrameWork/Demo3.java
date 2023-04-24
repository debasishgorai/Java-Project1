package CollectionFrameWork;

import java.util.*;
public class Demo3 {
public static void main(String[] args) {
	Set s=new HashSet();
	//Set s=new LinkedHashSet();
	//Set s=new TreeSet();
	s.add("sql");
	s.add("java");
	s.add("python");
	s.add("angular");
	s.add("react");
	for(Object o:s)
	{
		System.out.println(o);
	}
}

}
