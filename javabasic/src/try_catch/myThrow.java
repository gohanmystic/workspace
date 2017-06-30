package try_catch;

public class myThrow {

	static void validate (int tuoi){
		if (tuoi < 18) {
			throw new ArithmeticException("Khong hop le");
		} else {
			System.out.println("Hop le");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(13);
		System.out.println("Phan code con lai");
	}

}