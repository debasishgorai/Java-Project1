package DataStructure;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList al1= new ArrayList();
	al1.add(10);
	al1.add(20);
	al1.add(30);
	al1.add(40);
	al1.add(50);
	al1.add(60);
	al1.add(2,70);
	al1.add(80);
	al1.remove(1);
	for(int i=0;i<al1.size();i++) {
		System.out.println(al1.get(i));
	}

	}

}
