package Queue;

public class Queue {

	Node first=null;
	Node last=null;
	int count=0;
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node(e);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e);
		last=last.next;
		count++;
	}
	public int size()
	{
		return count;
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
    public Object peek()
    {
    	if(isEmpty()) return null;
    	return first.ele;
    }
    public Object poll()
    {
    	if(isEmpty()) return null;
    	Object e=first.ele;
    	first=first.next;
    	count--;
    	return e;
    }
    
}
