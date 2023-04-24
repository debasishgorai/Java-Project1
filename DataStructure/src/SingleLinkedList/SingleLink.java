package SingleLinkedList;
public class SingleLink{
private Node first;
private int count=0;
public void add(Object e)
{
	if(first==null)
	{
		first=new Node(e);
		count++;
		return;
	}
	Node curr=first;
	while(curr.next!=null)
	{
		curr=curr.next;
	}
curr.next=new Node(e);
count++;
}
public int size()
{
	return count;
}
public void add(Object e,int index)
{
	if(index<=-1||index>=size())
	{
		throw new IndexOutOfBoundsException();
	}
	if(index==0)
	{
		first=new Node(e,first);
		count ++;
		return;
	}
	Node curr=first;
	for (int i=1;i<index;i++)
	{
		curr=curr.next;
	}
	curr.next=new Node(e,curr.next);
	count ++;
}
public Object get(int index)
{
	if(index<=-1||index>=size())
	{
		throw new IndexOutOfBoundsException();
	}
	Node curr=first;
	for(int i=1;i<=index;i++)
	{
		curr=curr.next;
	}
	return curr.ele;
	
}
}

 class Node {
Object ele;
Node next;
public Node(Object e)
{
ele=e;	
}
public Node(Object e,Node n)
{
ele=e;
next=n;
}

}
