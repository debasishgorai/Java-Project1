package CollectionFrameWork;

import java.util.*;
public class Demo2 {
public static void main(String[] args) {
	Set s=new HashSet();
	System.out.println(s.add(30));
	System.out.println(s.add(30));
	System.out.println(s.add(30));
	System.out.println(s.add(20));
	System.out.println(s.add(30));
	for(Object o:s)
	{
		System.out.println(o);
	}
}

}
