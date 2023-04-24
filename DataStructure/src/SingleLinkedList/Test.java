package SingleLinkedList;

//import DataStructure.Node;

class Node{
	 Object ele; Node next;
	 public Node(Object e) {

         ele=e;
}
	 
		public Node(Object e,Node n){
			ele=e; next=n;
			
		}
	 	 
	
}
	 public class Test {
public static void main(String[] args) {
		Node first=null;
		first =new Node(10);
		first.next=new Node(20);
		first.next.next=new Node(30);
		Node curr=first;
		while(curr!=null) {
			System.out.println(curr.ele);
			curr=curr.next;
			
		}


}
}
