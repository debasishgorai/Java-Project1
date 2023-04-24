package Queue;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Queue q=new Queue();
			q.add(10);
			q.add(20);
			q.add(30);
			q.add(40);
			q.add(50);
		System.out.println(q.peek());	
		while(!q.isEmpty())
		{
			System.out.println(q.poll());	
		}
		
		System.out.println(q.isEmpty());
	}
}
