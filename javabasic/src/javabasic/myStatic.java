package javabasic;

class myNewStatic {
	static int number;
}

public class myStatic {

	static void show() {
		System.out.println("show Static function");
	}

	public void display() {
		// myNewStatic.number = 69;
		System.out.println("static number = " + myNewStatic.number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStatic.show();
		myStatic msts = new myStatic();
		myNewStatic mnsts = new myNewStatic();

		myNewStatic.number = 2;
		// mnsts.number = 100;
		msts.display();
	}

}
