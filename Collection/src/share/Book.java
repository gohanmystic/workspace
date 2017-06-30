package share;

public class Book implements Comparable<Book>{
	String title;
	
	public Book(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String t){
		title = t;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	@Override
	public int compareTo(Book o) {
		return title.compareToIgnoreCase(o.getTitle());
	}
	
}
