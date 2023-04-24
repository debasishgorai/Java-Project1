package CollectionFrameWork;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo {
	public static void main(String[] args) {
		Queue q1= new PriorityQueue();
		//Queue q1= new ArrayDeque();
		//Queue q1= new LinkedList();
		q1.add(30);
		q1.add(50);
		q1.add(10);
		q1.add(40);
		q1.add(20);
		while(!q1.isEmpty())
		{
			System.out.println(q1.poll());
		}
	}
}
