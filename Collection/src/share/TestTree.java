package share;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTree {
	public void go() {
		Book b1 = new Book("Tran Quoc Vu");
		Book b2 = new Book("Nguyen Thi Van");
		Book b3 = new Book("Long Khanh");
		Book b4 = new Book("long Khanh");

		Set<Book> TreeBook = new TreeSet<Book>();
		TreeBook.add(b1);
		TreeBook.add(b2);
		TreeBook.add(b3);
		TreeBook.add(b4);
	
		for (Book book : TreeBook) {
			System.out.println(book.toString());
		}
	}
	public static void main(String[] args) {
		new TestTree().go();
	}

}
