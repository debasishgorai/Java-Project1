package BinarySearchTree;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bst b = new Bst();
		System.out.println(b.add(10));
		System.out.println(b.add(20));
		System.out.println(b.add(10));
		System.out.println(b.add(30));
		System.out.println(b.add(40));
		System.out.println(b.add(50));
		System.out.println(b.add(5));
		System.out.println(b.add(7));

		b.levelOrder();
		b.postOrder();
		b.preOrder();
		b.inOrder();
	}
}
