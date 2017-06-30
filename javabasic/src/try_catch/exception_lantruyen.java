package try_catch;

public class exception_lantruyen {
	void m() {
		int data = 50 / 0; // exception duoc xu ly o day! (tinh lan truyen)
	}
	void n() {
		m(); 		//goi ham m()
	}
	void p() {
		try {
			n();  	// goi ham n()
		} catch(Exception e) {
			System.out.println("Exception duoc xu ly");
		}
	}
	
	public static void main (String [] args) {
		exception_lantruyen exc = new exception_lantruyen();
		exc.p();
		System.out.println("Xu ly xong");
	}
}
