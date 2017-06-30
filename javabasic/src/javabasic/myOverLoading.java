package javabasic;

public class myOverLoading {
	void show(int a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	void show(String a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myOverLoading mOL = new myOverLoading();
		
		mOL.show(1, "Tran Quoc Vu");
		mOL.show("Nguyen Van Vu", 2);
	}

}
