package exercisedevelopers;
class Book{
	String bookname;
	int pages;
	String publication;
	String author;
	double price;
	public Book(String bookname,int pages,String publication,String author,double price) {
	    
		super();
		this.bookname = bookname;
		this.author=author;
		this.pages=pages;
		this.price=price;
		this.publication=publication;
}
}
	class Ebook extends Book{
		String format;
		public Ebook(String bookname,int pages,String publication,String author,double price,String format) {
			super(bookname,pages,publication,author,price);
			this.format=format;
		
	}
@Override
public String toString() {
	System.out.println(super.toString());
	return "Ebook[format="+format+"]";
}


}

public class Library {
public static void main(String []args) {
	Ebook ebook1= new Ebook("java",123,"oracle","james",420,"softcopy");
	System.out.println(ebook1);
}
}
