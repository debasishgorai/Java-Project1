package StreamApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.utill.*;
public class TestMap {
public static void main(String[]args) {
	List<Integer>l=new ArrayList<>();
	l.add(2);
	l.add(3);
	l.add(13);
	l.add(12);
	l.add(5);
	l.add(6);
	List<Integer> l2 =l.stream().map(e->e*e).collect(Collections.toList());
	System.out.println( l);
}
}
