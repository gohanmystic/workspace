package try_catch;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[10];

		try {
			System.out.println("before");
			name[10] = "Tran Quoc Vu";
			int a = 5;
			int b = 0;
			System.out.println("a/b = " + a / b);
		} /*
			 * catch (Exception e) { System.out.println("Exception Error " +
			 * e.toString()); }
			 */
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Error " + e.toString());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Error " + e.toString());
		} finally { // ham finally luon luon chay trong try catch, duoc su dung
					// khi connect database hay file bi loi thi cau truc finnaly
					// de dong cac connection, file io, de tiet kiem bo nho
			System.out.println("Allways done");
		}
		System.out.println("after");
	}

}
