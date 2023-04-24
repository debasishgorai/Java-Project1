package BinarySearchTree;
	import java.util.*;
	public class Bst {
		Node root=null;
	    int count=0;
	    boolean flag=false;
	    public boolean add(int key)
	    {
	    	root=addNode(root,key);
	    return flag;
	    }
	    public Node addNode(Node n,int key)
	    {
	    	if(n==null)
	    	{
	    		n=new Node(key);
	    		count++;
	    		flag=true;
	    		return n;
	    	}
	    	else if(n.key>key)
	    	{n.left=addNode(n.left,key);
	    		
	    	}
	    	else if(n.key<key)
	    	{n.right=addNode(n.right,key);
	    		
	    	}
	    	else flag=false;
	    	return n;
	    }
	    public void levelOrder()
	    {
	    	Queue<Node> q=new LinkedList<Node>();
	    	
	    	if(root!=null) {q.add(root);};
	    	while(!q.isEmpty())
	    	{
	    		Node n=q.poll();
	    		
	    		System.out.println(n.key);
	    		
	    		if(n.left!=null)q.add(n.left);
	    		if(n.right!=null)q.add(n.right);
	    		
	    	}
	    	
	    }
	    public void postOrder()
	    {
	    	postOrder(root);
	    }
	    private void postOrder(Node n)
	    {
	    	
	    	if(n==null) return;
	    	postOrder(n.left);
	    	postOrder(n.right);
	    	System.out.print(n.key+" ");
	    }
	    public void preOrder()
	    {preOrder(root);
	    	
	    }
	    private void preOrder(Node n)
	    {
	    	if(n==null) return;
	    	System.out.print(n.key);
	    	preOrder(n.left);
	    	preOrder(n.right);
	    }
	    public void inOrder()
	    {inOrder(root);
	    	
	    }
	    private void inOrder(Node n)
	    {
	    	if(n==null) return;
	    
	    	inOrder(n.left);
	    	System.out.println(n.key);
	    	inOrder(n.right);
	         }
}
