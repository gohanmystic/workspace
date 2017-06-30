/*package try_catch;

public class checked_exception {

	void m() {
		throw new java.io.IOException("Divice Error"); // checked exception
	}

	void n() {
		m(); // goi ham m()
	}

	void p() {
		try {
			n(); // goi ham n()
		} catch (Exception e) {
			System.out.println("Exception duoc xu ly");
		}
	}

	public static void main(String[] args) {
		TestExceptionPropagation2 obj = new TestExceptionPropagation2();
		obj.p();
		System.out.println("Luong chuan");
	}

}
*/