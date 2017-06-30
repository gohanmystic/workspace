package oop;

public class extends_implements {
	public static void main (String[] args) {
		Book book = new Book();
		book.write();  // implements from Document
		book.delete(); // implements from Document
		book.copy();   // implements from ReferencesDoc
		
		ReferencesBook RefBook = new ReferencesBook();
		RefBook.write();  //
		RefBook.copy();
		RefBook.delete(); // extends from Book
		RefBook.title("Title Book from ReferencesBook");
	}
}

interface Document {
	public void write();
	abstract void delete();
}

interface ReferencesDoc extends Document {
	public void copy();
}

class Book implements Document
{

	public void write () {
		System.out.println("This is write function in Book implements Document");
	}
	
	public void delete () {
		System.out.println("This is delete function in Book implements Document");
	}
	
	public void copy () {
		System.out.println("This is copy function in Book implements ReferencesDoc");
	}
	
	protected void title (String title) {
		System.out.println("The title of Book is: " + title);
	}
	
}

class ReferencesBook extends Book implements ReferencesDoc{
	public void write () {
		System.out.println("This is write function in ReferencesBook implements ReferencesDoc");
	}
	public void copy () {
		System.out.println("This is copy function in ReferencesBook implements ReferencesDoc");
	}
}
